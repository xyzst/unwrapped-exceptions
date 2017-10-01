package io.rambaud.mapstruct.mapper;

import io.rambaud.mapstruct.dto.DeveloperDto;
import io.rambaud.mapstruct.entities.Developer;
import io.rambaud.mapstruct.exceptions.MappingException;
import io.rambaud.mapstruct.factory.EntityFactory;
import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {EntityFactory.class})
public interface DeveloperMapper {
    DeveloperMapper INSTANCE = Mappers.getMapper(DeveloperMapper.class);

//    @Mapping(target = "assignedProjects", ignore = true)
    Developer developerDtoToDeveloper(DeveloperDto dto, @Context CycleAvoidingMappingContext context) throws MappingException;

    @InheritInverseConfiguration
    DeveloperDto developerToDeveloperDto(Developer entity, @Context CycleAvoidingMappingContext context) throws MappingException;
}
