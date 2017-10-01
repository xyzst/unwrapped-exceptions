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
import org.mapstruct.factory.Mappers;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2017-10-01T18:40:27-0500",
    comments = "version: 1.2.0.CR2, compiler: javac, environment: Java 1.8.0_144 (Oracle Corporation)"
)
public class ProjectMapperImpl implements ProjectMapper {

    private final EntityFactory entityFactory = new EntityFactory();
    private final DeveloperMapper developerMapper = Mappers.getMapper( DeveloperMapper.class );

    @Override
    public Project projectDtoToProject(ProjectDto dto, CycleAvoidingMappingContext context) throws MappingException {
        Project target = context.getMappedInstance( dto, Project.class );
        if ( target != null ) {
            return target;
        }

        if ( dto == null ) {
            return null;
        }

        Project project = entityFactory.createEntity( Project.class );

        context.storeMappedInstance( dto, project );

        project.setId( dto.getId() );
        project.setName( dto.getName() );
        project.setPriority( dto.getPriority() );
        project.setAssignedDevelopers( developerDtoListToDeveloperList( dto.getAssignedDevelopers(), context ) );
        project.setBurnDownRate( dto.getBurnDownRate() );
        project.setHoursWasted( dto.getHoursWasted() );

        return project;
    }

    @Override
    public ProjectDto projectToProjectDto(Project entity, CycleAvoidingMappingContext context) throws MappingException {
        ProjectDto target = context.getMappedInstance( entity, ProjectDto.class );
        if ( target != null ) {
            return target;
        }

        if ( entity == null ) {
            return null;
        }

        ProjectDto projectDto = new ProjectDto();

        context.storeMappedInstance( entity, projectDto );

        projectDto.setId( entity.getId() );
        projectDto.setName( entity.getName() );
        projectDto.setPriority( entity.getPriority() );
        projectDto.setAssignedDevelopers( developerListToDeveloperDtoList( entity.getAssignedDevelopers(), context ) );
        projectDto.setBurnDownRate( entity.getBurnDownRate() );
        projectDto.setHoursWasted( entity.getHoursWasted() );

        return projectDto;
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
            list1.add( developerMapper.developerDtoToDeveloper( developerDto, context ) );
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
            list1.add( developerMapper.developerToDeveloperDto( developer, context ) );
        }

        return list1;
    }
}
