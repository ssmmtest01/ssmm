package com.hand.ssm.dao;

import com.hand.ssm.model.Online;

public interface OnlineMapper {
    int deleteByPrimaryKey(String id);

    int insert(Online record);

    int insertSelective(Online record);

    Online selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Online record);

    int updateByPrimaryKey(Online record);
}