package com.xa.warehouse.mapper.statistics;

import com.xa.warehouse.dto.statistics.StatisticsCreateDto;
import com.xa.warehouse.dto.statistics.StatisticsGetDto;
import com.xa.warehouse.dto.statistics.StatisticsUpdateDto;
import com.xa.warehouse.entity.statistics.Statistics;
import com.xa.warehouse.mapper.GenericMapper;
import org.mapstruct.Mapper;


@Mapper(componentModel =  "spring")
public interface StatisticsMapper
        extends GenericMapper
        <StatisticsCreateDto , StatisticsUpdateDto , StatisticsGetDto , Statistics>{
}
