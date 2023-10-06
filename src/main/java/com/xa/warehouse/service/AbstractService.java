package com.xa.warehouse.service;

import com.xa.warehouse.mapper.BaseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

@RequiredArgsConstructor
public abstract class AbstractService<M extends BaseMapper, R extends JpaRepository> extends BaseService {

    protected final M mapper;
    protected final R repository;

}
