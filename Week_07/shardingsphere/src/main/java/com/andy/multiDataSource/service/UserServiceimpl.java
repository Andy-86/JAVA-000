package com.andy.multiDataSource.service;

import com.andy.multiDataSource.data.IUserMapper;
import com.andy.multiDataSource.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * @author mac
 */
@RestController("userService")
@RequestMapping("/user")
public class UserServiceimpl {
    int i = 50;
    @Autowired
    private IUserMapper iuserMapper;

    @GetMapping("/get")
    public List<User> findAll() {
        return iuserMapper.findAll();
    }

    @GetMapping("/add")
    public void add() {
        User user = new User();
        user.setId((long) i++);
        user.setUsername("sss" + i);
        user.setPassword("sss" + i);
        iuserMapper.insert(user);
    }
}