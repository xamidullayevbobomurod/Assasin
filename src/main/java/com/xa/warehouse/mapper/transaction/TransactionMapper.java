package com.xa.warehouse.mapper.transaction;

import com.xa.warehouse.dto.transaction.TransactionCreateDto;
import com.xa.warehouse.dto.transaction.TransactionGetDto;
import com.xa.warehouse.dto.transaction.TransactionUpdateDto;
import com.xa.warehouse.entity.transaction.Transaction;
import com.xa.warehouse.mapper.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {SoldProductMapper.class})
public interface TransactionMapper extends GenericMapper<TransactionCreateDto, TransactionUpdateDto, TransactionGetDto, Transaction> {
}
