package com.graduation.app.repository;

import java.sql.Types;
import java.util.List;

public interface TypesRepository {
    /**
     * 類型マスタから全データを取得する
     * @return 類型マスタの全データ
     * Typesは必要に応じて変更
     */
    List<Types> selectAll();
}