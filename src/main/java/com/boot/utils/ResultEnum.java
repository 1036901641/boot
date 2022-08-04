package com.boot.utils;

/**
 * @author lenovo
 */

public enum ResultEnum implements IResult{
    /*
     * @describe :
     * @author 王继创
     * @date 10:15 2022/8/4
     * @param
     * @return null
     **/
    SUCCESS(2001, "接口调用成功"),
    VALIDATE_FAILED(2002, "参数校验失败"),
    COMMON_FAILED(2003, "接口调用失败"),
    FORBIDDEN(2004, "没有权限访问资源");

    private Integer code;
    private String message;

    ResultEnum(int i, String 接口调用成功) {
    }

    @Override
    public Integer getCode() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
