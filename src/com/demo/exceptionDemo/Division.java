package com.demo.exceptionDemo;

 class Division {
    public static int divide(int a,int b){
        int result=0;
        try{
            //double c=a/b;
            result=a/b;
            System.out.println(result);

        }catch(ArithmeticException e){
            System.out.println("错误：除数不能为0");

        }catch(Exception e){
            //System.out.println("发生未知异常：异常信息");
            System.out.println("发生未知异常：" + e.getMessage());
            //e.getMessage()获取异常的描述信息
            //已知错误：我们自己写提示文字；
            //未知兜底异常：不能写死文字，要读取异常对象自带的真实报错信息，方便定位 bug。

        }finally{
            System.out.println("除法运算执行完毕");

        }
        return result;
    }

}
//变量作用域：在try{}里面定义的变量，外面不能使用，需要把变量声明放到 try 外部。
//一个文件只能一个 public 类
//int / int结果还是 int，不会自动得到小数，必须强制类型转换。
//e.getMessage()获取异常真实描述，不要写死字符串
