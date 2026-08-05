package com.demo.gameCharacter;

public class Assassin extends GameCharacter implements Skill{
    public Assassin(String name,int level,int hp,RoleType roleType){
        super(name,level,hp,roleType);
        //子类 Assassin 自己没有写给 name、level、hp 赋值的代码。
        //super(name,level,hp,roleType);就是把收到的 4 个参数交给父类的构造器，由父类帮你给成员变量赋值。
    }
    @Override
    public void attack(){
        System.out.println("刺客【" + name + "】隐身发起突袭！");
    }
    @Override
    public void defend(){
        System.out.println("刺客【" + name + "】利用身法闪避伤害！");
    }
    @Override
    public void doAction(){
        attack();
        defend();
    }
    @Override
    public void castSkill(){
        System.out.println("刺客"+roleType.getTitle()+"释放了背刺");
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

