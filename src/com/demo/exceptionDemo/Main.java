package com.demo.exceptionDemo;

import static com.demo.exceptionDemo.Tool.deductMoney;

public class Main {
    public static void main(String[] args) {
        double num=Division.divide(10,2);
        System.out.println(num);
        Division.divide(8, 0);
        Division.divide(15, 3);

        System.out.println("------------------------");
        test(100,30);
        test(50,80);
        test(200,-10);
    }
    public static void test(double balance, double money) {
        try{
            Tool.deductMoney(balance,money);
            //Tool.deductMoney(100,30);
            //Tool.deductMoney(50,80);
            //Tool.deductMoney(200,-10);
            //try 块中，只要某一行抛出异常，try 剩余代码直接终止。
            //第二个调用抛异常，第三个deductMoney(200,-10)直接被跳过，负数的测试跑不到。
            //解决方法：每一次调用单独包一个 try‑catch（就比如这题try三次）；或者把每次调用放到独立方法（更好）
        } catch(BalanceNotEnoughException e) {
            System.out.println("余额不足异常" + e.getMessage());//规范：先捕获业务自定义异常，再捕获 JDK 自带异常。更重要：如果以后加通用Exception兜底，必须放最后。
        }catch(IllegalArgumentException e){
            System.out.println ("参数异常:"+e.getMessage());//throw new XxxException("消息")抛出的信息，尽量在 catch 中使用e.getMessage()获取，不要手写重复字符串。
        }catch (Exception e){
            System.out.println("未知异常："+e.getMessage());
        } finally{
            System.out.println("业务完成");
        }

    }
}



