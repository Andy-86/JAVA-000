package com.andy.multiDataSource.data;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author mac
 */
@Mapper
public interface IUserMapper {
    public List<User> findAll();

    public int insert(User user);
}