package com.andy.multiDataSource.data;

import com.andy.multiDataSource.annotaion.Slave;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author mac
 */
@Mapper
public interface IUserMapper {
    @Slave
    public List<User> findAll();

    public int insert(User user);
}