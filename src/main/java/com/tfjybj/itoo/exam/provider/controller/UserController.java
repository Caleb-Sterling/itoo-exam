package com.tfjybj.itoo.exam.provider.controller;

import com.tfjybj.itoo.exam.entity.User;
import com.tfjybj.itoo.exam.provider.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

        @Resource
        private UserService userService;

        @Resource
        private StringRedisTemplate stringRedisTemplate;

        @ApiOperation(value="ceshi")
        @GetMapping(value = "/select")
        public List<User> queryUserList()
        {
            stringRedisTemplate.opsForValue().set("1","1");
            String a= stringRedisTemplate.opsForValue().get("1");
            List<User> users= userService.queryUserList();
            for (User user:users) {
                user.setName(a);
            }
            return users;
        }

}
