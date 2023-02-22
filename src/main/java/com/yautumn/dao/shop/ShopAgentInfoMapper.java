package com.yautumn.dao.shop;

import com.yautumn.common.entity.shop.ShopAgentInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShopAgentInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ShopAgentInfo record);

    int insertSelective(ShopAgentInfo record);

    ShopAgentInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShopAgentInfo record);

    int updateByPrimaryKey(ShopAgentInfo record);
}