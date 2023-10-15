package com.xa.warehouse.dto.statistics;

import com.xa.warehouse.dto.BaseDto;
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

public class StatisticsCreateDto extends BaseDto {
    private List<Product> data;
    private Double totalPrice;

}




