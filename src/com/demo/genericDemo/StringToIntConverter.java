package com.demo.genericDemo;

public class StringToIntConverter implements Converter<String,Integer> {

    @Override
    public Integer convert(String source) {
        try {
            int num=Integer.parseInt(source);
            return num;
        } catch (NumberFormatException e) {
           return -1;
        }

    }
}
