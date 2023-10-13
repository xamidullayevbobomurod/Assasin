package com.xa.warehouse.dto.transaction;

import com.xa.warehouse.dto.GenericDto;
import com.xa.warehouse.dto.transaction.soldProduct.SoldProductUpdateDto;
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
public class TransactionUpdateDto extends GenericDto {

    private List<SoldProductUpdateDto> soldProducts;
    private Double totalPrice;

}
