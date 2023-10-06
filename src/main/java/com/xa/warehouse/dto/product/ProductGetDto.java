package com.xa.warehouse.dto.product;

import com.xa.warehouse.dto.GenericDto;
import com.xa.warehouse.dto.image.ImageGetDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductGetDto extends GenericDto {

    private List<ImageGetDto> image;
    private String name;
    private Integer amount;
    private Double purchasePrice;
    private Double sellingPrice;
    private String status;
    private LocalDate expiredDate;
}
