package com.chris.springboot.service.impl;

import com.chris.springboot.entity.AutoIncrementEntity;
import com.chris.springboot.mapper.AutoIncrementMapper;
import com.chris.springboot.service.AutoIncrementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Chris on 2017/12/4.
 */

@Service
public class AutoIncrementServiceImpl implements AutoIncrementService {

    @Autowired
    private AutoIncrementMapper mAutoIncrementEntityMapper;

    @Override
    public int insertData(AutoIncrementEntity autoIncrementEntity) throws Exception {
        return mAutoIncrementEntityMapper.insertData(autoIncrementEntity);
    }

    @Override
    public AutoIncrementEntity selectData(Long id) throws Exception {
        return mAutoIncrementEntityMapper.selectData(id);
    }

    @Override
    public int deleteData(Long id) throws Exception {
        return mAutoIncrementEntityMapper.deleteData(id);
    }

    @Override
    public int updateData(AutoIncrementEntity autoIncrementEntity) throws Exception {
        return mAutoIncrementEntityMapper.updateData(autoIncrementEntity);
    }
}