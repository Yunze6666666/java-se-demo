package com.demo.lambdaDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //工具类只提供框架方法，运算逻辑全部交给调用者 main 去写 lambda 传入
        Scanner sc=new Scanner(System.in);
        System.out.println("num1:");
        int num1=sc.nextInt();
        System.out.println("num2:");
        int num2=sc.nextInt();

        System.out.print("加法结果：");
        CalcTool.calculate(num1,num2,(a,b)->{return num1+num2;});
        System.out.print("减法结果：");
        CalcTool.calculate(num1,num2,(a,b)->{return num1-num2;});
        System.out.print("乘法结果：");
        CalcTool.calculate(num1,num2,(a,b)->{return num1*num2;});
        /*
        CalcTool.calculate(x, y, new Calculator() {
           @Override
           public int compute(int a, int b) {
               return a * b;
           }
        });
        new Calculator(){...} → 创建了一个匿名内部类对象，这个对象实现了 Calculator 接口
把这个对象传给第三个参数 Calculator calculator,相当于Calculator calculator=new....
        */
        System.out.print("两数最大值：");
        CalcTool.calculate(num1,num2,(a,b)->a>b?a:b);


    }
}
/**接口中有且仅有一个抽象方法，这种接口叫函数式接口。
 如果接口有 2 个及以上抽象方法，不能用 Lambda。
 语法格式：(参数列表) -> { 方法体代码 };
 Lambda 本质：就是实现函数式接口，创建接口对象。不是对象，不是方法，是一段可传递的代码块。
 抽象类不能用 Lambda！哪怕只有一个抽象方法也不行。
 Lambda 可以干什么:
 赋值给函数式接口变量
 作为方法参数传递（最常用！把一段代码当参数传给方法）
 作为方法返回值返回
 */