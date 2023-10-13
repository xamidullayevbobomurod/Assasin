package com.xa.warehouse.mapper.transaction;

import com.xa.warehouse.dto.transaction.soldProduct.SoldProductCreateDto;
import com.xa.warehouse.dto.transaction.soldProduct.SoldProductGetDto;
import com.xa.warehouse.dto.transaction.soldProduct.SoldProductUpdateDto;
import com.xa.warehouse.entity.transaction.SoldProduct;
import com.xa.warehouse.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SoldProductMapper extends GenericMapper<SoldProductCreateDto, SoldProductUpdateDto, SoldProductGetDto, SoldProduct> {



}
