package com.xa.warehouse.dto.image;


import com.xa.warehouse.dto.BaseDto;
import com.xa.warehouse.dto.GenericDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ImageGetDto extends GenericDto {

    private String originalName;
    private String generatedName;
    private String extension;
    private Long size;
    private String path;
    private String url;

}
