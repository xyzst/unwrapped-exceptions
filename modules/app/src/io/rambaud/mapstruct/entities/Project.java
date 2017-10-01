package io.rambaud.mapstruct.entities;

import io.rambaud.mapstruct.inheritance.Entity;
import io.rambaud.mapstruct.models.ProjectModel;

import java.util.List;

public class Project implements ProjectModel, Entity<ProjectModel> {

    private Long id;

    private String name;

    private Integer priority;

    private List<Developer> assignedDevelopers;

    private Double burnDownRate;

    private Integer hoursWasted;

    private Long potentialCashFlow;

    public Long getId() {
        return id;
    }

    public Project setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public Project setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public List<Developer> getAssignedDevelopers() {
        return assignedDevelopers;
    }

    public Project setAssignedDevelopers(List<Developer> assignedDevelopers) {
        this.assignedDevelopers = assignedDevelopers;
        return this;
    }

    public Double getBurnDownRate() {
        return burnDownRate;
    }

    public Project setBurnDownRate(Double burnDownRate) {
        this.burnDownRate = burnDownRate;
        return this;
    }

    public Integer getHoursWasted() {
        return hoursWasted;
    }

    public Project setHoursWasted(Integer hoursWasted) {
        this.hoursWasted = hoursWasted;
        return this;
    }

    public Long getPotentialCashFlow() {
        return potentialCashFlow;
    }

    public Project setPotentialCashFlow(Long potentialCashFlow) {
        this.potentialCashFlow = potentialCashFlow;
        return this;
    }
}
