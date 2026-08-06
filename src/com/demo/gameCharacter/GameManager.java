package com.demo.gameCharacter;
import java.util.ArrayList;
import java.util.List;

public class GameManager {
    private static final GameManager instance = new GameManager();//创建唯一实例

    private GameManager(){}

    public static GameManager getInstance(){
        return instance;
    }//提供 getInstance() 获取唯一实例

    private List<GameCharacter> characterList = new ArrayList<>();
    //List：接口，代表列表集合，只能存对象
    //<GameCharacter>：泛型，限定这个集合里面只能存放 GameCharacter 以及它的子类对象，不能放别的类型
    //List 本身是接口，接口不能 new 对象！
    //❌ new List<>() 直接编译报错。这是后面要学的LIst集合
    // 声明一个私有的、只能装GameCharacter对象的集合，创建ArrayList实例
    public void addCharacter(GameCharacter c){
        characterList.add(c);
    }
    /*
    c 只是一个引用变量，不代表要 new 父类对象，GameCharacter c 只是定义引用变量的类型，c 这个引用，指向堆里面的【子类 Assassin 对象】
    引用类型变量：只存地址，不存对象本体。
对象本体永远是 new XXX() 出来的。
GameCharacter c：仅仅是引用变量，只存地址，不会创建父类对象。
对象一定来自 new 子类()，堆里面只有子类对象。
父类（包括抽象类）可以做引用，指向子类实例，就是向上转型。
抽象类不能 new，但是可以用来声明变量
     */
    public void showALLChararcters(){
        for(GameCharacter character:characterList){
            System.out.println(character);
        }
        System.out.println("===========================\n");
    }
    public void startBattle() {
        System.out.println("######### 战斗开始 #########");
        for (GameCharacter character : characterList) {
            character.performTurn();
        }
        System.out.println("######### 战斗结束 #########");
    }
}
/*
*这是一个单例类
*构造器私有化，不让别人 new。
*内部创建唯一一个静态的、私有的本类实例。
*提供一个公共的静态方法，返回这个实例
*有两种饿汉式和懒汉式
*/
