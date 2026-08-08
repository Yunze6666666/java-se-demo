package com.demo.genericDemo;
//<T>：类泛型，整个类里面T代表data的数据类型，创建对象的时候确定T是什么类型
public class ApiResult<T> {
    private final T data;
    private final int code;
    private final String message;

    public ApiResult(T data, int code, String message) {
        this.data = data;
        this.code = code;
        this.message = message;
    }
//只有getter，没有setter！外部只能读取，不能修改对象内部属性
    public T getData() {
        return data;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
    // 【静态泛型方法】static后面的<T>：给这个静态方法单独定义泛型T
    // 注意：这个T 和类上面的<T> 不是同一个！静态方法不属于对象，不能直接使用类的泛型
    // 返回值 ApiResult<T>：返回一个泛型为T的ApiResult对象
    public static <T> ApiResult<T> ok(T data){
        //ApiResult<T> result1=new ApiResult<T>(data,200,"success");
        // return result1;
        return new ApiResult<>(data, 200, "success");
        // new ApiResult<>(...) 菱形语法<>，编译器自动推断尖括号里面的T
    }
    public static <T> ApiResult error(int code,String message){
        ApiResult<T> result2=new ApiResult<T>(null,code,message);
        return result2;
    }

    @Override
    public String toString() {
        return "ApiResult{" +
                "data=" + data +
                ", code=" + code +
                ", message='" + message + '\'' +
                '}';
    }
    // 【实例方法的泛型】<R>写在返回值前面，代表这个方法新增一个泛型R
    // T：来自类上面的泛型（当前对象data的类型）
    // R：转换之后新data的类型，调用map的时候才确定是什么类型
    // 参数 Converter<T,R> converter：转换器，输入T，输出R
    public <R> ApiResult<R> map(Converter<T,R> converter){
        // this 代表当前这个ApiResult<T>对象
        if (this.code != 200) {
            //卫语句（guard clause）
            //把异常 / 失败情况放最前面，满足就直接 return，提前结束方法。
            //失败情况快速 return，少一层 else 大括号嵌套
            //后面代码，默认就是 “成功状态”，不需要包在 {} 里面，代码缩进更少，看着清爽
            // 失败状态，直接返回包含 null 的失败结果
            // 当前是失败：不执行转换逻辑！
            // 新建全新ApiResult<R>对象，data=null，code、message沿用旧对象的值
            return new ApiResult<>(null, this.code, this.message);
        }// 走到这里代表code==200，成功状态
        // this.data 是 T类型，调用转换器convert，得到转换后 R类型的 newData
        // 成功状态，执行转换
        R convertedData = converter.convert(this.data);
        return new ApiResult<>(convertedData, 200, "success");
    }
}


// 静态泛型方法：在返回值前声明 <T>
// 静态方法泛型<T> ≠ 类的<T>
//静态方法不能直接使用类上定义的泛型，必须自己声明<T>。