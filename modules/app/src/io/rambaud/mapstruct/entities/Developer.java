package io.rambaud.mapstruct.entities;

import io.rambaud.mapstruct.inheritance.Entity;
import io.rambaud.mapstruct.models.DeveloperModel;

import java.util.List;

public class Developer implements DeveloperModel, Entity<DeveloperModel> {

    private Long id;

    private String firstName;

    private String lastName;

    private String department;

    private Integer experience;

    private Double salary;

    private List<Project> assignedProjects;

    public Long getId() {
        return id;
    }

    public Developer setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Developer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Developer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Developer setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Integer getExperience() {
        return experience;
    }

    public Developer setExperience(Integer experience) {
        this.experience = experience;
        return this;
    }

    public Double getSalary() {
        return salary;
    }

    public Developer setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    public List<Project> getAssignedProjects() {
        return assignedProjects;
    }

    public Developer setAssignedProjects(List<Project> assignedProjects) {
        this.assignedProjects = assignedProjects;
        return this;
    }
}
