package com.yh.takeawaysystem.service.impl;

import com.yh.takeawaysystem.dao.UserMapper;
import com.yh.takeawaysystem.entity.User;
import com.yh.takeawaysystem.exception.ExceptionEnums;
import com.yh.takeawaysystem.exception.GlobalException;
import com.yh.takeawaysystem.model.LoginValidator;
import com.yh.takeawaysystem.service.UserService;
import com.yh.takeawaysystem.utils.MD5Util;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User login(LoginValidator loginValidator) {
        Integer count = userMapper.selectUserByUsername(loginValidator.getUsername());
        if(count != 1){
            throw new GlobalException(ExceptionEnums.USER_DONT_EXIST_ERROR);
        }
        String originPwd = loginValidator.getPassword();
        // 用户密码不使用明文存储
        String dbPwd = MD5Util.getMD5(originPwd);
        loginValidator.setPassword(dbPwd);
        User user = userMapper.selectUser(loginValidator);
        if (user == null) {
            throw new GlobalException(ExceptionEnums.USER_PASSWORD_ERROR);
        }
        return user;

    }

    @Override
    public void register(User user) {
        Integer count = userMapper.selectUserByUsername(user.getUsername());
        if (count == 1) {
            throw new GlobalException(ExceptionEnums.USER_EXIST_ERROR);
        }
        String originPwd = user.getPassword();
        // 用户密码不使用明文存储
        String dbPwd = MD5Util.getMD5(originPwd);
        user.setPassword(dbPwd);
        user.setCreateTime(LocalDateTime.now());
        userMapper.insertUser(user);

    }
}
