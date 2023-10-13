package com.xa.warehouse.service.transaction;

import com.xa.warehouse.mapper.transaction.SoldProductMapper;
import com.xa.warehouse.mapper.transaction.TransactionMapper;
import com.xa.warehouse.repository.SoldProductRepository;
import com.xa.warehouse.repository.TransactionRepository;
import com.xa.warehouse.service.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class TransactionService extends AbstractService<TransactionMapper, TransactionRepository> {

    private final SoldProductRepository SoldProductRepository;
    private final SoldProductMapper SalesProductMapper;

    public TransactionService(TransactionMapper mapper, TransactionRepository repository, TransactionRepository transactionRepository, com.xa.warehouse.repository.SoldProductRepository soldProductRepository, TransactionMapper transactionMapper, SoldProductMapper salesProductMapper) {
        super(mapper, repository);
        SoldProductRepository = soldProductRepository;
        SalesProductMapper = salesProductMapper;
    }


}





