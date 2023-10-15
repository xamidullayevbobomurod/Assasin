package com.xa.warehouse.repository;

import com.xa.warehouse.entity.statistics.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatisticsRepository extends JpaRepository<Statistics, Long> {
}
