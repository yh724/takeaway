package com.yh.takeawaysystem.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import java.time.LocalDateTime;

@Data
public class User {
    /**
     * 用户id
     */
    private String id;

    /**
     * 用户名
     */
    @NotBlank
    private String username;

    /**
     * 用户昵称
     */
    @NotNull
    private String nickname;

    /**
     * 用户性别
     */
    @Range(min = 0, max = 1)
    private Integer sex;

    /**
     * 用户密码
     */
    @NotNull
    private String password;

    /**
     * 用户手机号
     */
    @NotBlank
    private String phone;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户注册时间
     */
    private LocalDateTime createTime;
}

