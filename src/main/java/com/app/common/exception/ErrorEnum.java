package com.app.common.exception;

import lombok.Getter;

/**
 * @author 舒润
 */

@Getter
public enum ErrorEnum {

    /**
     *
     */
    BAD_TOKEN(5001,"bad token"),
    NOTFOUND_TOKEN(401,"not found token,请重新登录"),
    NOT_FOUND(404, "请求的资源找不到!"),
    TOKEN_ERROR(5002,"this token is error,please reload"),
    FORBIDDEN(403,"抱歉，你无权限访问!"),
    BAN_ADD(1000,"添加内容失败");
    private Integer code;
    private String message;

    ErrorEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
