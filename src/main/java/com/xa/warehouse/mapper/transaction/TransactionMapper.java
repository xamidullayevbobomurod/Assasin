package com.xa.warehouse.mapper.transaction;

import com.xa.warehouse.mapper.BaseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {SoldProductMapper.class})
public interface TransactionMapper extends BaseMapper {
}
