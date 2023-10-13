package com.xa.warehouse.dto.transaction;

import com.xa.warehouse.dto.GenericDto;
import com.xa.warehouse.dto.transaction.soldProduct.SoldProductGetDto;
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
public class TransactionGetDto extends GenericDto {

    private List<SoldProductGetDto> soldProducts;
    private Double totalPrice;

}
