package com.yautumn.dao.shop;

import com.yautumn.common.entity.shop.ShopInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ShopInfo record);

    int insertSelective(ShopInfo record);

    ShopInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ShopInfo record);

    int updateByPrimaryKey(ShopInfo record);

    int selectCount();

    List<ShopInfo> findShopAll(Integer start, int end);
}