package com.demo.gameCharacter;

public class Warrior extends GameCharacter implements Equipable {
    public Warrior(String name, int level, int hp, RoleType roleType) {
        super(name, level, hp, roleType);
    }

    @Override
    public void attack(){
        System.out.println(name+"挥剑");

    }
    @Override
    public void defend(){
        System.out.println(name+"举盾");

    }
    @Override
    public void doAction(){
        attack();
        defend();

    }
    @Override
    public void equipWeapon(String weapon){
        System.out.println("战士"+name+"装备了"+weapon);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
