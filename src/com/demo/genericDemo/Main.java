package com.demo.genericDemo;

public class Main {
    public static  void main(String[] args) {
        ApiResult<String> num=ApiResult.ok("123");
        System.out.println("转换前: " + num);
        ApiResult<Integer> num1=num.map(new StringToIntConverter());
        System.out.println("转换后: " + num1);

        ApiResult<String> errorResult = ApiResult.error(500, "服务器内部错误");
        System.out.println("失败结果: " + errorResult);
        ApiResult<Integer> mappedError = errorResult.map(new StringToIntConverter());
        System.out.println("转换后: " + mappedError);

        ApiResult<String> invalidResult = ApiResult.ok("abc");
        ApiResult<Integer> invalidMapped = invalidResult.map(new StringToIntConverter());
        System.out.println("非法数字转换: " + invalidMapped);
    }
}
