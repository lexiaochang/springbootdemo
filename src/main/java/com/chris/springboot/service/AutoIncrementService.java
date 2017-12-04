package com.chris.springboot.service;

import com.chris.springboot.entity.AutoIncrementEntity;

/**
 * Created by Chris on 2017/12/4.
 */

public interface AutoIncrementService {
    int insertData(AutoIncrementEntity autoIncrementEntity) throws Exception;

    AutoIncrementEntity selectData(Long id) throws Exception;

    int deleteData(Long id) throws Exception;

    int updateData(AutoIncrementEntity autoIncrementEntity) throws Exception;
}
