package io.rambaud.mapstruct.models;

import io.rambaud.mapstruct.entities.Developer;
import io.rambaud.mapstruct.entities.Project;
import io.rambaud.mapstruct.inheritance.Model;

import java.util.List;

public interface ProjectModel extends Model {

    Long getId();

    Project setId(Long id);

    String getName();

    Project setName(String name);

    Integer getPriority();

    Project setPriority(Integer priority);

    List<Developer> getAssignedDevelopers();

    Project setAssignedDevelopers(List<Developer> assignedDevelopers);

    Double getBurnDownRate();

    Project setBurnDownRate(Double burnDownRate);

    Integer getHoursWasted();

    Project setHoursWasted(Integer hoursWasted);

    Long getPotentialCashFlow();

    Project setPotentialCashFlow(Long potentialCashFlow);
}
