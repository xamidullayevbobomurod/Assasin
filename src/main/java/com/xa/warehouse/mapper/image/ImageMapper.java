package com.xa.warehouse.mapper.image;

import com.xa.warehouse.dto.image.ImageCreateDto;
import com.xa.warehouse.dto.image.ImageGetDto;
import com.xa.warehouse.dto.image.ImageUpdateDto;
import com.xa.warehouse.entity.image.Image;
import com.xa.warehouse.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImageMapper extends GenericMapper
        <ImageCreateDto, ImageUpdateDto , ImageGetDto , Image> {
}
