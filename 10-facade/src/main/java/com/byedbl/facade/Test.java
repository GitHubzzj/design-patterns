package com.byedbl.facade;

/**
 * <pre>
 * 门面模式
 *
 * 比如我现在想建一个房子,大家知道建房子很复杂,要砌墙,造门,装修等等等....
 * 如果不用门面模式,那我们要对整个的创建过程很熟悉,有了门面模式之后就很简单了
 * 门面类提供方法叫建房子createRoom,我直接调用就可以啦,完全不用管里面具体要干什么
 *
 * 利用门面模式,我们可以大大减少外围系统和其他子系统的各种复杂交互
 *
 * @author : zengzhijun
 * @date : 2018/5/24 10:03
 **/
class Wall {
    public Wall() {
        System.out.println("Create a wall !");
    }
}

class Door {
    public Door() {
        System.out.println("Create a door !");
    }
}

class FacadeRoom {
    public void createRoom() {
        Wall wall1 = new Wall();
        Wall wall2 = new Wall();
        Wall wall3 = new Wall();
        Wall wall4 = new Wall();
        Door door = new Door();
    }

}

public class Test {
    public static void main(String[] args) {
        FacadeRoom room = new FacadeRoom();
        room.createRoom();
    }
}