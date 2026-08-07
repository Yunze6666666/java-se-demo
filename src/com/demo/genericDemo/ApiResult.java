package com.demo.genericDemo;

import java.util.function.Function;

public class ApiResult<T> {
    T data;
    int code;
    String message;

    public ApiResult(T data, int code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    public static <T> void ok(T data){
        int code=200;
        String message="success";
        System.out.println(data+message);
    }
    public static <T> void error(int code,String message){
        T data=null;
        System.out.println(data);
    }
    public <R> ApiResult<R> map(Converter<T,R> f){

    }
}
// 静态泛型方法：在返回值前声明 <T>