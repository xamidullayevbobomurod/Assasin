package com.xa.warehouse.service;

import com.xa.warehouse.mapper.BaseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@RequiredArgsConstructor
public abstract class AbstractService<M extends BaseMapper, R extends JpaRepository> extends BaseService {

    private final M mapper;
    private final R repository;

}
