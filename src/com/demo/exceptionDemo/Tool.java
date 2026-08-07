package com.demo.exceptionDemo;

class Tool {
    public static void deductMoney(double balance,double money) throws BalanceNotEnoughException {
        if(money<0){
            throw new IllegalArgumentException("扣款金额不能为负数");
        }else if(balance<money){
            throw new BalanceNotEnoughException("提示：余额不足，当前余额："+balance);
        }else{
            System.out.println("扣款成功，扣款："+money+"剩余余额:"+(balance-money));
        }

    }
}
