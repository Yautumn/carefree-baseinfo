package com.yautumn.dao.shop;

import com.yautumn.common.entity.CompanyCommodityInfo;

public interface CompanyCommodityInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(CompanyCommodityInfo record);

    int insertSelective(CompanyCommodityInfo record);

    CompanyCommodityInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CompanyCommodityInfo record);

    int updateByPrimaryKey(CompanyCommodityInfo record);
}