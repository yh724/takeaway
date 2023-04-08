package com.yh.takeawaysystem.model;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class LoginValidator {
    /**
     * 用户登录名
     */
    @NotBlank
    private String username;

    /**
     * 用户登录密码
     */
    @NotBlank
    private String password;
}
