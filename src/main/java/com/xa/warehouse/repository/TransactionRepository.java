package com.xa.warehouse.repository;

import com.xa.warehouse.entity.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long > {
}
