package com.demo.studentGrades;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入学生人数:");
        int n=sc.nextInt();
        Student[] stu =new Student[n];//创建引用类型数组，此时都是null，需要创建对象
        //stu[n-1]=new com.demo.studentGrades.Student();改正之前在这的代码，错误原因：只创建第n-1位学生

        for(int i=0;i<n;i++){
            //for 循环 + Scanner 录入，调用 set 方法赋值
            //一开始没有想到
            stu[i]=new Student();//不理解
            System.out.println("请输入第"+(i+1)+"个学生姓名：");
            String name = sc.next();
            stu[i].setName(name);
            System.out.println("请输入年龄：");
            int age = sc.nextInt();
            stu[i].setAge(age);
            System.out.println("请输入分数：");
            int score = sc.nextInt();
            stu[i].setScore(score);
            //stu[i].getName();
            //stu[i].getAge();
             //stu[i].getScore();
            //对getter、setter理解不深刻，不知道怎么样输入
            //get 是读取数据，你这里需要用 Scanner 输入，调用set 方法赋值
        }//将姓名、年龄、分数输入进每一位学生
        Student.school="清华";//设置统一名称

        for(int i=0;i<n;i++){
            stu[i].showInfo();
            //stu[n].showInfo();
            //n超出数组下标范围！数组下标最大是 n-1
        }
        Student maxstudent= Student.getMaxScore(stu);
        maxstudent.showInfo();
    }
}
//com.demo.studentGrades.Student[] arr = new com.demo.studentGrades.Student[5];
//数组创建完成，arr[0]~arr[4] 全部为null
//使用数组元素前，必须执行 arr[i] = new com.demo.studentGrades.Student();
//没有 new 对象，直接 arr[i].方法() → 空指针异常
//拿到外界数据后，必须调用 set 方法存入对象
//get 方法只是查看，不能修改对象内部属性
