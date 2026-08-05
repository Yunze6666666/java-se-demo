package com.demo.gameCharacter;

public class Main {
    public static void main(String[] args) {
        GameCharacter hero1=new Warrior("张三",6,999,RoleType.WARRIOR);
        GameCharacter hero2=new Mage("李四",5,444,RoleType.MAGE);
        GameCharacter hero3=new Assassin("王五",4,555,RoleType.ASSASSIN);
        //创建三个人物

        Warrior a=(Warrior)hero1;//向下转型，必须要用 instanceof 检查，避免 ClassCastException
        //如下 Animal a = new Cat();
        //if (a instanceof Cat) {    // 先判断，再转型，安全
        //Cat c = (Cat) a;
        //c.catchMouse();         // Cat特有方法
        //}
        a.equipWeapon("圣剑");

        GameManager manager = GameManager.getInstance();//因为构造器被私有，只能调用静态方法

        manager.addCharacter(hero1);
        manager.addCharacter(hero2);
        manager.addCharacter(hero3);

        manager.showALLChararcters();

        manager.startBattle();


        System.out.println("\n【枚举信息测试】");
        System.out.println(RoleType.ASSASSIN.getDescription());
    }
}