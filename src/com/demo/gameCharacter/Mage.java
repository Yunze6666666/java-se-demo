package com.demo.gameCharacter;

public class Mage extends GameCharacter implements Skill{
    public Mage(String name,int level,int hp,RoleType roletype){
        super(name,level,hp,roletype);
    }
    @Override
    public void attack(){
        System.out.println(name+"释放攻击魔法");
    }
    @Override
    public void defend(){
        System.out.println(name+"释放防御魔法");
    }
    @Override
    public void doAction(){
        attack();
        defend();
    }
    @Override
    public void castSkill(){
        System.out.println("法师"+ roleType.getTitle()+"释放了火球术");
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

