package com.xa.warehouse.dto.statistics;

import com.xa.warehouse.dto.GenericDto;
import com.xa.warehouse.entity.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StatisticsUpdateDto extends GenericDto {

    private List<Product> data;
    private Double totalPrice;

}
