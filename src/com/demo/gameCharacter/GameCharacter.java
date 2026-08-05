package com.demo.gameCharacter;

abstract class GameCharacter {
    public static final int MAX_LEVEL=100;
    String name;
    int level;
    int hp;
    RoleType roleType;

    public final String getName(){
        return name;
    }
    //防止子类重写

    public GameCharacter(String name, int level, int hp,RoleType roleType) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.roleType = roleType;
    }

    public abstract void attack();
    public abstract void defend();

    @Override
    public String toString() {
        return "["+roleType.getTitle()+"]"+name+"|"+"lv:"+level+"|"+"Hp:"+hp;
    }

    public final void performTurn(){
        prepare();
        doAction();
        endTurn();
    }

    public void prepare(){
        System.out.println(name+"正在准备 ...");
    }

    public abstract void doAction();

    public void endTurn(){
        System.out.println(name+"结束回合，剩余Hp："+hp);
    }
}
/**抽象类可以有构造器，供子类调用
 *抽象方法只能用 public 或 protected 修饰
 * 如果子类也是抽象类，可以暂时不实现父类的抽象方法，交给更下一层的子类去实现
 */