package com.xa.warehouse.dto.product;

import com.xa.warehouse.dto.GenericDto;
import com.xa.warehouse.dto.image.ImageGetDto;
import com.xa.warehouse.entity.image.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductUpdateDto extends GenericDto {

    private Long id;
    private List<ImageGetDto> image;
    private String name;
    private Integer amount;
    private Double purchase_price;
    private Double selling_price;
    private String status;
    private LocalDateTime expired_date;

}
