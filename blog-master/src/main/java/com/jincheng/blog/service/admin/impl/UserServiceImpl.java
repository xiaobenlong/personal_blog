package com.jincheng.blog.service.admin.impl;

import com.jincheng.blog.po.User;
import com.jincheng.blog.service.admin.UserService;
import com.jincheng.blog.mapper.UserMapper;
import com.jincheng.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author kuls
 * @Desc kuls
 * @date 2020/5/4 5:28 下午
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User checkUser(String name, String password) {
        User user = userMapper.userCheck(name, MD5Utils.code(password));

        return user;
    }
}
