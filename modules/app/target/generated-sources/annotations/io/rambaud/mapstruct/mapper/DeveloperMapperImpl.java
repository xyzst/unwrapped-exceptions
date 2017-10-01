package io.rambaud.mapstruct.mapper;

import io.rambaud.mapstruct.dto.DeveloperDto;
import io.rambaud.mapstruct.dto.ProjectDto;
import io.rambaud.mapstruct.entities.Developer;
import io.rambaud.mapstruct.entities.Project;
import io.rambaud.mapstruct.exceptions.MappingException;
import io.rambaud.mapstruct.factory.EntityFactory;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-10-01T18:12:00-0500",
    comments = "version: 1.2.0.CR2, compiler: javac, environment: Java 1.8.0_144 (Oracle Corporation)"
)
public class DeveloperMapperImpl implements DeveloperMapper {

    private final EntityFactory entityFactory = new EntityFactory();

    @Override
    public Developer developerDtoToDeveloper(DeveloperDto dto, CycleAvoidingMappingContext context) throws MappingException {
        Developer target = context.getMappedInstance( dto, Developer.class );
        if ( target != null ) {
            return target;
        }

        if ( dto == null ) {
            return null;
        }

        Developer developer = entityFactory.createEntity( Developer.class );

        context.storeMappedInstance( dto, developer );

        developer.setId( dto.getId() );
        developer.setFirstName( dto.getFirstName() );
        developer.setLastName( dto.getLastName() );
        developer.setDepartment( dto.getDepartment() );
        developer.setExperience( dto.getExperience() );
        developer.setSalary( dto.getSalary() );
        developer.setAssignedProjects( projectDtoListToProjectList( dto.getAssignedProjects(), context ) );

        return developer;
    }

    @Override
    public DeveloperDto developerToDeveloperDto(Developer entity, CycleAvoidingMappingContext context) throws MappingException {
        DeveloperDto target = context.getMappedInstance( entity, DeveloperDto.class );
        if ( target != null ) {
            return target;
        }

        if ( entity == null ) {
            return null;
        }

        DeveloperDto developerDto = new DeveloperDto();

        context.storeMappedInstance( entity, developerDto );

        developerDto.setId( entity.getId() );
        developerDto.setFirstName( entity.getFirstName() );
        developerDto.setLastName( entity.getLastName() );
        developerDto.setDepartment( entity.getDepartment() );
        developerDto.setExperience( entity.getExperience() );
        developerDto.setSalary( entity.getSalary() );
        developerDto.setAssignedProjects( projectListToProjectDtoList( entity.getAssignedProjects(), context ) );

        return developerDto;
    }

    protected List<Developer> developerDtoListToDeveloperList(List<DeveloperDto> list, CycleAvoidingMappingContext context) throws MappingException {
        List<Developer> target = context.getMappedInstance( list, List.class );
        if ( target != null ) {
            return target;
        }

        if ( list == null ) {
            return null;
        }

        List<Developer> list1 = new ArrayList<Developer>( list.size() );
        context.storeMappedInstance( list, list1 );

        for ( DeveloperDto developerDto : list ) {
            list1.add( developerDtoToDeveloper( developerDto, context ) );
        }

        return list1;
    }

    protected Project projectDtoToProject(ProjectDto projectDto, CycleAvoidingMappingContext context) {
        Project target = context.getMappedInstance( projectDto, Project.class );
        if ( target != null ) {
            return target;
        }

        if ( projectDto == null ) {
            return null;
        }

        Project project = entityFactory.createEntity( Project.class );

        context.storeMappedInstance( projectDto, project );

        project.setId( projectDto.getId() );
        project.setName( projectDto.getName() );
        project.setPriority( projectDto.getPriority() );
        try {
            project.setAssignedDevelopers( developerDtoListToDeveloperList( projectDto.getAssignedDevelopers(), context ) );
        }
        catch ( MappingException e ) {
            throw new RuntimeException( e );
        }
        project.setBurnDownRate( projectDto.getBurnDownRate() );
        project.setHoursWasted( projectDto.getHoursWasted() );

        return project;
    }

    protected List<Project> projectDtoListToProjectList(List<ProjectDto> list, CycleAvoidingMappingContext context) {
        List<Project> target = context.getMappedInstance( list, List.class );
        if ( target != null ) {
            return target;
        }

        if ( list == null ) {
            return null;
        }

        List<Project> list1 = new ArrayList<Project>( list.size() );
        context.storeMappedInstance( list, list1 );

        for ( ProjectDto projectDto : list ) {
            list1.add( projectDtoToProject( projectDto, context ) );
        }

        return list1;
    }

    protected List<DeveloperDto> developerListToDeveloperDtoList(List<Developer> list, CycleAvoidingMappingContext context) throws MappingException {
        List<DeveloperDto> target = context.getMappedInstance( list, List.class );
        if ( target != null ) {
            return target;
        }

        if ( list == null ) {
            return null;
        }

        List<DeveloperDto> list1 = new ArrayList<DeveloperDto>( list.size() );
        context.storeMappedInstance( list, list1 );

        for ( Developer developer : list ) {
            list1.add( developerToDeveloperDto( developer, context ) );
        }

        return list1;
    }

    protected ProjectDto projectToProjectDto(Project project, CycleAvoidingMappingContext context) {
        ProjectDto target = context.getMappedInstance( project, ProjectDto.class );
        if ( target != null ) {
            return target;
        }

        if ( project == null ) {
            return null;
        }

        ProjectDto projectDto = new ProjectDto();

        context.storeMappedInstance( project, projectDto );

        projectDto.setId( project.getId() );
        projectDto.setName( project.getName() );
        projectDto.setPriority( project.getPriority() );
        try {
            projectDto.setAssignedDevelopers( developerListToDeveloperDtoList( project.getAssignedDevelopers(), context ) );
        }
        catch ( MappingException e ) {
            throw new RuntimeException( e );
        }
        projectDto.setBurnDownRate( project.getBurnDownRate() );
        projectDto.setHoursWasted( project.getHoursWasted() );

        return projectDto;
    }

    protected List<ProjectDto> projectListToProjectDtoList(List<Project> list, CycleAvoidingMappingContext context) {
        List<ProjectDto> target = context.getMappedInstance( list, List.class );
        if ( target != null ) {
            return target;
        }

        if ( list == null ) {
            return null;
        }

        List<ProjectDto> list1 = new ArrayList<ProjectDto>( list.size() );
        context.storeMappedInstance( list, list1 );

        for ( Project project : list ) {
            list1.add( projectToProjectDto( project, context ) );
        }

        return list1;
    }
}
