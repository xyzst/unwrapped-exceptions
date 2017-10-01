package io.rambaud.mapstruct.models;

import io.rambaud.mapstruct.entities.Developer;
import io.rambaud.mapstruct.entities.Project;
import io.rambaud.mapstruct.inheritance.Model;

import java.util.List;

public interface DeveloperModel extends Model {

    Long getId();

    Developer setId(Long id);

    String getFirstName();

    Developer setFirstName(String firstName);

    String getLastName();

    Developer setLastName(String lastName);

    String getDepartment();

    Developer setDepartment(String department);

    Integer getExperience();

    Developer setExperience(Integer experience);

    Double getSalary();

    Developer setSalary(Double salary);

    List<Project> getAssignedProjects();

    Developer setAssignedProjects(List<Project> assignedProjects);
}
