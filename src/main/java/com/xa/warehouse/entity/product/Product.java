package com.xa.warehouse.entity.product;

import com.xa.warehouse.entity.Auditable;
import com.xa.warehouse.entity.image.Image;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Where;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Where(clause = "is_deleted = false") // delete bo'lganlarni select qilmaydi
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

    @OneToMany(fetch = FetchType.EAGER)
    private List<Image> images;




}
