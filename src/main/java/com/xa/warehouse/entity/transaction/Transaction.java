package com.xa.warehouse.entity.transaction;

import com.xa.warehouse.entity.Auditable;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
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

    @ManyToMany(fetch = FetchType.EAGER)
    private List<SoldProduct> soldProducts;
    private Double totalPrice;


}
