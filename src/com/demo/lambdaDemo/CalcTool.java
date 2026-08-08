package com.demo.lambdaDemo;

public class CalcTool {
        public static void calculate(int a, int b, Calculator calculator){

            System.out.println(calculator.compute(a,b));

            /*Calculator add1=(num1,num2)->{
                return num1+num2;
            };
            Calculator reduce1=(num1,num2)->{
                return num1-num2;
            };
            Calculator mult1=(num1,num2)->{
                return num1*num2;
            };
            语法不会报错，但是毫无意义：
            每次调用calculate，都会重复创建 3 个 lambda 对象，但是根本不去用它们。逻辑写死在里面，就失去 “外部传入不同规则” 的设计意义。
            */

        }
    }

/*
面向对象里的策略模式思想：
把多变的算法（策略）抽离出来，作为参数传入，固定模板代码复用
 */