package com.xa.warehouse.dto.transaction.soldProduct;

import com.xa.warehouse.dto.GenericDto;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SoldProductGetDto extends GenericDto {

    private String name;

    private Integer amount;

    private Double purchasePrice;

    private Double sellingPrice;

    private LocalDate expiredDate;

}
