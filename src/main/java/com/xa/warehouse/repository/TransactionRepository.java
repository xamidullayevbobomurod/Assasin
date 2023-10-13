package com.xa.warehouse.repository;

import com.xa.warehouse.entity.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.ZonedDateTime;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long > {
    @Query(value = "SELECT * FROM transaction WHERE created_at > ?1 and created_at < ?2  ORDER BY transaction_time DESC;", nativeQuery = true)
    List<Transaction> findByCreatedDate(ZonedDateTime s, ZonedDateTime e);

}
