package com.demo.APIDemo;

public class StudentUtil {
    //传入学生数组 + 过滤规则接口，返回过滤之后的学生字符串拼接结果
    public static String filterStudents(Student[] stus, StudentFilter filter){
        StringBuilder sb =new StringBuilder();

        for (Student stu:stus){
            if(filter.test(stu)){
                sb.append(stu.toString());
                sb.append("\n");
            }


        }
        return sb.toString();
    }
}
/*API(StringBuilder):
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" World");
sb.insert(5, ",");
sb.toString(); // 最终转成String

 */
