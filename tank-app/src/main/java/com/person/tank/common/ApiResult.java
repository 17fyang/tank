package com.person.tank.common;

/**
 * @author crowOnThePlane
 * @version 1.0
 * @date 2022/4/21 23:27
 */
public class ApiResult<T> {

    private int code;
    private String msg;
    private T data;

    public ApiResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ApiResult(T data) {
        this.code=200;
        this.msg="";
        this.data = data;
    }

    public static ApiResult<String> ok(){
        return new ApiResult<>("");
    }
    public static <T> ApiResult<T> fail(Exception e){
        return new ApiResult<>(500,e.getMessage(),null);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
