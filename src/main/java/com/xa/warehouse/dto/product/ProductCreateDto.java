package com.xa.warehouse.dto.product;

import com.xa.warehouse.dto.BaseDto;
import com.xa.warehouse.entity.image.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateDto extends BaseDto {


    private Image image;
    private String name;
    private Integer amount;
    private Double purchase_price;
    private Double selling_price;
    private String status;
    private LocalDateTime expired_date;

}
