package com.xa.warehouse.dto.transaction.soldProduct;

import com.xa.warehouse.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SoldProductUpdateDto extends BaseDto {

    private String name;

    private Integer amount;

    private Double purchasePrice;

    private Double sellingPrice;

    private LocalDate expiredDate;

}
