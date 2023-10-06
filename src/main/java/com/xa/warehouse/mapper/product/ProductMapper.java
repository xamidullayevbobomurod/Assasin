package com.xa.warehouse.mapper.product;

import com.xa.warehouse.dto.product.ProductCreateDto;
import com.xa.warehouse.dto.product.ProductGetDto;
import com.xa.warehouse.dto.product.ProductUpdateDto;
import com.xa.warehouse.entity.product.Product;
import com.xa.warehouse.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper
        extends GenericMapper<ProductCreateDto, ProductUpdateDto, ProductGetDto, Product> {


}
