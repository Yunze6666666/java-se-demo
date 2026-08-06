package com.demo.APIDemo;

public class Test {
    public static void main(String[] args) {
        Student[] arr = {
                new Student("张三",18,88.5),
                new Student("李四",22,59.0),
                new Student("王五",19,92.0),
                new Student("赵六",17,76.0)
        };
        System.out.println("====>=18岁学生====");
        String ageResult=StudentUtil.filterStudents(arr,(stu)->{return stu.getAge()>=18;});
        System.out.println(ageResult);
        String[] ageArr = ageResult.split("\n");
        System.out.println("匹配总人数：" + ageArr.length);

        System.out.println("\n====>=80分学生====");
        String scoreResult=StudentUtil.filterStudents(arr,(stu)->{return stu.getScore()>=80;});
        System.out.println(scoreResult);
        String[] scoreArr = scoreResult.split("\n");
        System.out.println("匹配总人数：" + scoreArr.length);
    }
}
/*
考察全部知识点清单
Object：重写toString()
String、StringBuilder（字符串拼接）
String API：split()分割字符串
函数式接口 + Lambda 作为方法参数
数组遍历
自动装箱拆箱（写 get/set 会接触）
append添加内容 + append("\n")存入换行 → 返回长字符串 → split("\n")以换行切割(切开字符串得到数组，统计学生数量) → 得到数组，length得到人数。
 */
