package com.graduation.app.service;

import java.sql.Types;
import java.util.List;

public interface TypesService {
    /**
     * 類型マスタの全データを取得する
     * @return　類型マスタの全データ
     */
    List<Types> findAllType();
}