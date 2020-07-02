package com.tfjybj.itoo.exam.provider.service;

import com.tfjybj.itoo.exam.entity.User;
import com.tfjybj.itoo.exam.provider.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService     {

    @Resource
    private UserDao userDao;

    public List<User> queryUserList(){
        return this.userDao.queryUserList();
    }
}

