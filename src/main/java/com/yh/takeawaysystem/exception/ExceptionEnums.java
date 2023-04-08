package com.yh.takeawaysystem.exception;

public enum ExceptionEnums {
    // 001 - 用户模块错误
    USER_EXIST_ERROR("001-001","注册用户已存在。"),
    USER_PASSWORD_ERROR("001-002","用户名或密码错误。"),
    USER_DONT_EXIST_ERROR("001-003","用户不存在"),
    ;

    ExceptionEnums(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String code;
    private String message;
}
