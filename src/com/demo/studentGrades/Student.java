package com.demo.studentGrades;

public class Student {
    static String school;//静态变量
    private String name;//私有化封装
    private int age;
    private double score;
    public Student() {}//无参

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }//有参

    public static String getSchool() {
        return school;
    }

    public static void setSchool(String school) {
        Student.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public void showInfo(){
        System.out.println("姓名:"+name+",年龄:"+age+",成绩:"+score+",学校:"+school);
    }//方法，用来打印姓名、年龄、成绩、学校。注意在打印过程中System.out.println() 只支持 1 个参数，不能传入多个逗号隔开的值
    //还可以这样：System.out.printf("姓名:%s，年龄:%d，成绩:%f，学校:%s%n", name, age, score, school);%s字符串、%d整数、%f小数、%n代表换行
    //之前错误是这样：System.out.println("姓名："+成绩，“年龄：”+age，“成绩：”+score，“学校：”+school)
    public static Student getMaxScore(Student[] stu){
        Student max= stu[0];//开始做的时候没有想到要这样，student是引用数据类型，定义一个max


        for(int i=0;i< stu.length;i++)//可以从1开始
            {
            if(stu[i].getScore()>max.getScore()){
                max=stu[i];
            }//else{return stu[i]；}只要遇到第一个分数不大于当前最高分的学生，直接return结束方法！
        }
        return max;
    }
}
//return一旦执行，整个方法立刻结束，循环直接终止。
//查找最值逻辑：必须遍历完所有元素，循环结束之后再 return 最终结果，循环内部绝对不能随便 return。


