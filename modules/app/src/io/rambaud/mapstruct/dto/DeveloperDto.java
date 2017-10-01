package io.rambaud.mapstruct.dto;

import io.rambaud.mapstruct.entities.Developer;
import io.rambaud.mapstruct.inheritance.DTO;

import java.util.List;

public class DeveloperDto implements DTO<Developer> {

    private Long id;

    private String firstName;

    private String lastName;

    private String department;

    private Integer experience;

    private Double salary;

    private List<ProjectDto> assignedProjects;

    public Long getId() {
        return id;
    }

    public DeveloperDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public DeveloperDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public DeveloperDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public DeveloperDto setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Integer getExperience() {
        return experience;
    }

    public DeveloperDto setExperience(Integer experience) {
        this.experience = experience;
        return this;
    }

    public Double getSalary() {
        return salary;
    }

    public DeveloperDto setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    public List<ProjectDto> getAssignedProjects() {
        return assignedProjects;
    }

    public DeveloperDto setAssignedProjects(List<ProjectDto> assignedProjects) {
        this.assignedProjects = assignedProjects;
        return this;
    }
}
