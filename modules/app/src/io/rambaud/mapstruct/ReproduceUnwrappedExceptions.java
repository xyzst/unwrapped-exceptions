package io.rambaud.mapstruct;

import io.rambaud.mapstruct.dto.DeveloperDto;
import io.rambaud.mapstruct.dto.ProjectDto;
import io.rambaud.mapstruct.entities.Developer;
import io.rambaud.mapstruct.entities.Project;
import io.rambaud.mapstruct.mapper.CycleAvoidingMappingContext;
import io.rambaud.mapstruct.mapper.DeveloperMapper;
import io.rambaud.mapstruct.mapper.ProjectMapper;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsNot.not;

public class ReproduceUnwrappedExceptions {

    @Test
    public void unwrappedExceptionsTest() throws Exception {
        final Long juniorId = 5L;
        final Long seniorId = 6L;
        final Long projectId = 1L;

        List<Project> projects = new ArrayList<>();
        List<Developer> developers = new LinkedList<>();

        Developer junior = new Developer()
                .setId(juniorId)
                .setFirstName("Caleb")
                .setLastName("Smith")
                .setDepartment("Artificial Intelligence")
                .setExperience(1337)
                .setSalary(75000.00);

        Developer senior = new Developer()
                .setId(seniorId)
                .setFirstName("Nathan")
                .setLastName("Bateman")
                .setDepartment("Artificial Intelligence")
                .setExperience(9001)
                .setSalary(5000000000000000.00);

        developers.add(junior);
        developers.add(senior);

        Project project = new Project()
                .setId(projectId)
                .setName("MK_ULTRA")
                .setPriority(5)
                .setBurnDownRate(777777777.99)
                .setHoursWasted(180000)
                .setPotentialCashFlow(8329085732504357L)
                .setAssignedDevelopers(developers);

        projects.add(project);
        junior.setAssignedProjects(projects);
        senior.setAssignedProjects(projects);

        ProjectDto projectDto = ProjectMapper.INSTANCE.projectToProjectDto(project, new CycleAvoidingMappingContext());
        assertThat(projectDto, is(not(equalTo(null))));
        assertThat(projectDto.getId(), is(equalTo(projectId)));

        DeveloperDto juniorDeveloperDto = DeveloperMapper.INSTANCE.developerToDeveloperDto(junior, new CycleAvoidingMappingContext());
        assertThat(juniorDeveloperDto, is(not(equalTo(null))));
        assertThat(juniorDeveloperDto.getId(), is(equalTo(juniorId)));

        DeveloperDto seniorDeveloperDto = DeveloperMapper.INSTANCE.developerToDeveloperDto(senior, new CycleAvoidingMappingContext());
        assertThat(seniorDeveloperDto, is(not(equalTo(null))));
        assertThat(seniorDeveloperDto.getId(), is(equalTo(seniorId)));
    }
}
