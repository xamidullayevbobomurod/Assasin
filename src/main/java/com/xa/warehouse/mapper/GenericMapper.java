package com.xa.warehouse.mapper;

import com.xa.warehouse.dto.BaseDto;
import com.xa.warehouse.entity.BaseEntity;
import org.mapstruct.MappingTarget;

import java.util.List;

//public interface GenericMapper<CD extends BaseDto, UD extends GenericDto, GD extends GenericDto, E extends BaseEntity> extends BaseMapper{
public interface GenericMapper<CD extends BaseDto, UD extends BaseDto, GD extends BaseDto, E extends BaseEntity> extends BaseMapper{
    E fromCreateDTO(CD createDTO);

    E fromUpdateDTO(UD updateDTO, @MappingTarget E entity);

    GD toGetDTO(E entity);

    E fromGetDTO(GD dto);

    List<GD> toListDTO(List<E> entities);


}
