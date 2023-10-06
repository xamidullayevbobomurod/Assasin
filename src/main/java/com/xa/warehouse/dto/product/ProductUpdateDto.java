package com.xa.warehouse.dto.product;

import com.xa.warehouse.dto.GenericDto;
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
public class ProductUpdateDto extends GenericDto {



    @NotNull(message = "Id must not be null")
    private Long id;

    @NotNull(message = "Image must not be null")
    private List<ImageGetDto> image;

    @NotNull(message = "Name must not be null")
    private String name;

    @NotNull(message = "Amount must not be null")
    private Integer amount;

    @NotNull(message = "Purchase_price must not be null")
    private Double purchase_price;

    @NotNull(message = "Selling_price must not be null")
    private Double selling_price;

    @NotNull(message = "Status must not be null")
    private String status;

    @NotNull(message = "Expired_date must not be null")
    private LocalDateTime expired_date;

}
