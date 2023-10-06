package com.xa.warehouse.dto.product;

import com.xa.warehouse.dto.BaseDto;
import com.xa.warehouse.dto.image.ImageGetDto;
import com.xa.warehouse.entity.image.Image;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateDto extends BaseDto {


    private List<ImageGetDto> image;

    @NotNull(message = "Name must not be null")
    private String name;
    private Integer amount;
    private Double purchase_price;
    private Double selling_price;
    private String status;
    private LocalDateTime expired_date;

}
