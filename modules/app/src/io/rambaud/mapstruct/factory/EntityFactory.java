package io.rambaud.mapstruct.factory;

import io.rambaud.mapstruct.exceptions.MappingException;
import io.rambaud.mapstruct.inheritance.Entity;
import org.mapstruct.ObjectFactory;
import org.mapstruct.TargetType;

public class EntityFactory {

    @ObjectFactory
    public <T extends Entity> T createEntity(@TargetType Class<T> entityClass) throws MappingException {
        T entity;

        try {
            entity = entityClass.newInstance();
        } catch (IllegalAccessException | InstantiationException exception) {
            throw new MappingException("Rare exception thrown, refer to stack trace", exception);
        } catch (Exception exception) {
            throw new MappingException("I don't know how you got here, refer to stack trace", exception);
        }

        return entity;
    }
}
