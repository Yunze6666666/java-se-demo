package com.demo.anonymousInnerClassDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculator add1=new Calculator(){
            @Override
            public int calculate(int a,int b){
                return a+b;
            }
        };
        /*
        new Calculator()：Calculator 是接口，接口本身不能 new 对象！
这里不是实例化接口，大括号{}代表创建一个 Calculator 的匿名实现子类，new 的是这个看不见名字的子类对象。
{ @Override void calculate() {...} }：匿名子类的类体，必须重写接口全部抽象方法。
把这个匿名子类的对象赋值给父接口引用Calculator add1 。
分号;不能漏掉，完整是一条语句。
         */

        Calculator reduce1=new Calculator(){
            @Override
            public int calculate(int a,int b){
                return a-b;
            }
        };
        /*
        new Calculator() { ... } 的真实含义是：
"我要创建一个类，它实现了 Calculator接口，然后立刻 new 一个它的实例。
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("输入a：");
        int a=sc.nextInt();
        System.out.println("输入b:");
        int b=sc.nextInt();

        System.out.println("两数之和为"+add1.calculate(a,b));
        System.out.println("两数相减为"+reduce1.calculate(a,b));
    }
}
/**
 * 注意：
 * 匿名内部类不能写构造方法，因为没有类名
 * 一个匿名内部类只能创建一个对象
 * 可以重写父类 / 接口的方法；但是不能写自己独有的新方法
 *匿名内部类中不能修改外部方法的局部变量。但是外部局部变量只要有效 final（不重新赋值）就可以访问。
 *匿名内部类里的 this 指代匿名内部类对象本身，如果要指代外部类对象，用 外部类名.this
 */
