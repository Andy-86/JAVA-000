package com.andy.multiDataSource.service;

import com.andy.multiDataSource.context.ReadWriteDataSourceContext;
import com.andy.multiDataSource.data.IUserMapper;
import com.andy.multiDataSource.data.User;
import com.andy.multiDataSource.emuns.DBType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author mac
 */
@RestController("userService")
@RequestMapping("/user")
public class UserServiceimpl {

    @Autowired
    private IUserMapper iuserMapper;

    @GetMapping("/get")
    public List<User> findAll() {
        //ReadWriteDataSourceContext.setDBType(DBType.Slave);
        return iuserMapper.findAll();
    }

    @GetMapping("/add")
    public void add() {
        User user = new User();
        user.setId(1L);
        user.setUsername("sss");
        user.setPassword("sss");
        // ReadWriteDataSourceContext.setDBType(DBType.Master);
        iuserMapper.insert(user);
    }
}