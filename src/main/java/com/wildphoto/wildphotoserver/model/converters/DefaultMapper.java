package com.wildphoto.wildphotoserver.model.converters;

public interface DefaultMapper<D, E> {

    D entityToDTO (E entity);

    E DTOToEntity (D dto);

}
