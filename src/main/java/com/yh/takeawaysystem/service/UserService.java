package com.yh.takeawaysystem.service;

import com.yh.takeawaysystem.entity.User;
import com.yh.takeawaysystem.model.LoginValidator;

public interface UserService {

    /**
     * 登录功能实现
     * @param loginValidator 用户登录信息检验类
     */
    User login(LoginValidator loginValidator);

    /**
     * 注册功能实现
     * @param user - 用户注册表单信息
     */
    void register(User user);
}
