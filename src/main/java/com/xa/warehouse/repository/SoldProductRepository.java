package com.xa.warehouse.repository;

import com.xa.warehouse.entity.transaction.SoldProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SoldProductRepository extends JpaRepository<SoldProduct, Long> {
}
