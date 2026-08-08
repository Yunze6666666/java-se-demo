package com.demo.genericDemo;
@FunctionalInterface
public interface Converter<S,T> {
    // S source 源类型；T target 目标类型
    T convert(S source);

}
//S：要转换的原始数据类型
//T：转换完成之后的数据类型
