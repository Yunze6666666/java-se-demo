package com.demo.gameCharacter;

public enum RoleType {
    WARRIOR("战士",666),
    MAGE("法师",200),
    ASSASSIN("刺客",400);
    private String title;
    private double baseHp;
    RoleType(String title,int baseHP){
        this.title=title;
        this.baseHp=baseHP;
    }
    public String getTitle(){
        return title;
    }
    public double getBaseHp(){return baseHp;}

    public String getDescription(){
        return title + "，基础生命值：" + baseHp;
    }
}

/**枚举可以有成员变量、构造器（必须是私有），每个枚举值都可以携带数据
 *
 */