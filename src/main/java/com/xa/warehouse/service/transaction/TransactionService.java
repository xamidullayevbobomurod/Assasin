package com.xa.warehouse.service.transaction;

import com.xa.warehouse.entity.transaction.Transaction;
import com.xa.warehouse.mapper.transaction.TransactionMapper;
import com.xa.warehouse.repository.TransactionRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {
    private final TransactionMapper mapper;
    private final TransactionRepository repository;


    public TransactionService(TransactionMapper mapper, TransactionRepository repository) {
        this.mapper = mapper;
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public Transaction findProductById(Long id){
        return repository.findById(id).orElse(null);
    }


    }




}
