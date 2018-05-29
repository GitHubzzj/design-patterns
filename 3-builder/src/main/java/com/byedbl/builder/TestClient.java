package com.byedbl.builder;

/**
 * 建造者角色:
 * <ul>
 *     <li>导演角色(Director)
 *     <li>创建者角色
 *     <li>具体创建者角色
 *     <li>产品,产品可能也有一个抽象类
 * </ul>
 * <pre>
 * 建造者模式适合场景:
 * 1. 产品内部有复杂的结构
 * 2. 产品对象的属性相互依赖,比如邮件,有前后依赖关系,缺一不可,这种可以在 Director 角色里规定必要的流程
 *    ConcreteBuilder 负责具体的创建工作
 * 3. 换一个 ConcreteBuilder 就换了一种款式的产品.很方便
 * </pre>
 * <p> 与工厂模式的区别:
 *  两者都是创建产品,建造者用意是得到宏观的层面得到一个最终的产品,而工厂模式可能是产品的一个零件
 **/
public class TestClient  {
    public TestClient() {
    }

    public static void main(String[] args) {
        House myHouse ;
        ConcreteHouseBuilderA myHouseBuilder = new ConcreteHouseBuilderA();
        HouseDirector myHouseDirector = new HouseDirector();
        myHouseDirector.CreateHouse(myHouseBuilder);
        myHouse = myHouseBuilder.getHouse();

        System.out.println("My house has room :" + myHouse.getRoomNumber());
        System.out.println("My house has door :" + myHouse.getDoorNumber());
    }
}