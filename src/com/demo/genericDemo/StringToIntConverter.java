package com.demo.genericDemo;

public class StringToIntConverter implements Converter<String,Integer> {

    @Override
    public Integer convert(String source) {
        int num=Integer.parseInt(source);
        return num;
    }
}
