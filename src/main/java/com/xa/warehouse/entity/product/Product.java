package com.xa.warehouse.entity.product;

import com.xa.warehouse.entity.Auditable;
import com.xa.warehouse.entity.image.Image;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Where(clause = "is_deleted = false")
public class Product extends Auditable {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer amount;


    @Column(nullable = false)
    private Double purchasePrice;


    @Column(nullable = false)
    private Double sellingPrice;


    @Column(nullable = false)
    private String status;


    @Column(nullable = false)
    private LocalDate expiredDate;

    @ManyToMany(fetch = FetchType.EAGER)
    private List<Image> images;




}
