package com.tfjybj.itoo.exam.provider.dao;


import com.tfjybj.itoo.exam.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("UserDao")
public interface UserDao {
    List<User> queryUserList();
}