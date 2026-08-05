package com.demo.lambdaDemo;
@FunctionalInterface
//@FunctionalInterface 强制校验：接口只能有一个抽象方法，多写直接编译报错。
public interface Calculator {
    int compute(int num1,int num2);
}
