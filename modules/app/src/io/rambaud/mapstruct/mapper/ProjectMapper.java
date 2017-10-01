package io.rambaud.mapstruct.mapper;

import io.rambaud.mapstruct.dto.ProjectDto;
import io.rambaud.mapstruct.entities.Project;
import io.rambaud.mapstruct.exceptions.MappingException;
import io.rambaud.mapstruct.factory.EntityFactory;
import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {EntityFactory.class, DeveloperMapper.class})
public interface ProjectMapper {
    ProjectMapper INSTANCE = Mappers.getMapper(ProjectMapper.class);

    Project projectDtoToProject(ProjectDto dto, @Context CycleAvoidingMappingContext context) throws MappingException;

    @InheritInverseConfiguration
    ProjectDto projectToProjectDto(Project entity, @Context CycleAvoidingMappingContext context) throws MappingException;
}
