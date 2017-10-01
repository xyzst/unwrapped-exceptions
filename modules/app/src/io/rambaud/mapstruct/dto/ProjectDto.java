package io.rambaud.mapstruct.dto;

import io.rambaud.mapstruct.entities.Project;
import io.rambaud.mapstruct.inheritance.DTO;

import java.util.List;

public class ProjectDto implements DTO<Project> {

    private Long id;

    private String name;

    private Integer priority;

    private List<DeveloperDto> assignedDevelopers;

    private Double burnDownRate;

    private Integer hoursWasted;

    private Long potentionalCashFlow;

    public Long getId() {
        return id;
    }

    public ProjectDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProjectDto setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getPriority() {
        return priority;
    }

    public ProjectDto setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    public List<DeveloperDto> getAssignedDevelopers() {
        return assignedDevelopers;
    }

    public ProjectDto setAssignedDevelopers(List<DeveloperDto> assignedDevelopers) {
        this.assignedDevelopers = assignedDevelopers;
        return this;
    }

    public Double getBurnDownRate() {
        return burnDownRate;
    }

    public ProjectDto setBurnDownRate(Double burnDownRate) {
        this.burnDownRate = burnDownRate;
        return this;
    }

    public Integer getHoursWasted() {
        return hoursWasted;
    }

    public ProjectDto setHoursWasted(Integer hoursWasted) {
        this.hoursWasted = hoursWasted;
        return this;
    }

    public Long getPotentionalCashFlow() {
        return potentionalCashFlow;
    }

    public ProjectDto setPotentionalCashFlow(Long potentionalCashFlow) {
        this.potentionalCashFlow = potentionalCashFlow;
        return this;
    }
}
