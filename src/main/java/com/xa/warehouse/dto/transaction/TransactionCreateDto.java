package com.xa.warehouse.dto.transaction;

import com.xa.warehouse.dto.BaseDto;
import com.xa.warehouse.dto.transaction.soldProduct.SoldProductCreateDto;
import com.xa.warehouse.entity.transaction.SoldProduct;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionCreateDto extends BaseDto {

    private List<SoldProductCreateDto> soldProducts;
    private Double totalPrice;

}
