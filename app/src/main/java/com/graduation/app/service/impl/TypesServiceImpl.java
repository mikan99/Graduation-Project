package com.graduation.app.service.impl;

import java.sql.Types;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import com.graduation.app.service.TypesService;

@Service
public class TypesServiceImpl implements TypesService {

    private final SqlSessionTemplate sqlSessionTemplate;

    public TypesServiceImpl(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<Types> findAllType() {
        return sqlSessionTemplate.getMapper(com.graduation.app.repository.TypesRepository.class).selectAll();
    }
}