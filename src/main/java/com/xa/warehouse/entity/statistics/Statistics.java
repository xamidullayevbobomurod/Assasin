package com.xa.warehouse.entity.statistics;


import com.xa.warehouse.entity.Auditable;
import com.xa.warehouse.entity.product.Product;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Statistics extends Auditable {
    private List<Product> data;
    private double totalPrice;

}













