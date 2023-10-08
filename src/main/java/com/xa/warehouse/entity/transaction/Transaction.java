package com.xa.warehouse.entity.transaction;

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
public class Transaction extends Auditable {

    private List<Product> Products;
    private Double totalPrice;


}
