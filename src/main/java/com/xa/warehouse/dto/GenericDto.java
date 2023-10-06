package com.xa.warehouse.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GenericDto extends BaseDto {
    @NotNull(message = "Id not be null")
    private Long id;


}
