package com.xa.warehouse.entity.transaction;

import com.xa.warehouse.entity.Auditable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SoldProduct extends Auditable {


    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer amount;


    @Column(nullable = false)
    private Double purchasePrice;


    @Column(nullable = false)
    private Double sellingPrice;


    @Column(nullable = false)
    private LocalDate expiredDate;

}
