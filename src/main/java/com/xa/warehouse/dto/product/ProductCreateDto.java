package com.xa.warehouse.dto.product;

import com.xa.warehouse.dto.BaseDto;
import com.xa.warehouse.dto.image.ImageGetDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductCreateDto extends BaseDto {

    private List<ImageGetDto> images;
    @NotNull(message = "Name must not be null")
    private String name;
    @NotNull(message = "Amount must not be null")
    private Integer amount;
    @NotNull(message = "Purchase price must not be null")
    private Double purchasePrice;
    @NotNull(message = "Selling price must not be null")
    private Double sellingPrice;
    @NotNull(message = "Status must not be null")
    private String status;
    @NotNull(message = "Expired date must not be null")
    private LocalDate expiredDate;

}
