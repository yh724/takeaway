package com.yh.takeawaysystem.dao;

import com.yh.takeawaysystem.entity.User;
import com.yh.takeawaysystem.model.LoginValidator;

public interface UserMapper {
    /**
     * 查询用户是否存在
     * @param username 用户名称
     * @return 0-不存在 1-存在
     */
    Integer selectUserByUsername(String username);

    /**
     * 新增用户
     * @param user 用户信息
     */
    void insertUser(User user);

    /**
     * 用户账号密码校验
     * @param loginValidator 校验信息
     * @return 若账密正确，返回用户信息
     */
    User selectUser(LoginValidator loginValidator);
}
