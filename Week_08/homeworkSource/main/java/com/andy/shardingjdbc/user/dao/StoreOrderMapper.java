package com.andy.shardingjdbc.user.dao;

import com.andy.shardingjdbc.user.model.StoreOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author mac
 */
@Mapper
public interface StoreOrderMapper {
    public int deleteByPrimaryKey(@Param("orderId") Long orderId);

    public int insert(StoreOrder record);

    public int insertSelective(StoreOrder record);

    public StoreOrder selectByPrimaryKey(@Param("orderId") Long orderId);

    public int updateByPrimaryKeySelective(StoreOrder record);

    public int updateByPrimaryKey(StoreOrder record);
}