package com.byedbl.shape;

import com.byedbl.shape.factory.simple.ShapeStaticFactory;
import com.byedbl.template.AbstractRead;
import com.byedbl.template.ReadHtml;
import org.junit.Test;
/**
 * <pre>
 * 本例为静态工厂方法(简单工厂模式)
 * 工厂方法能增加系统的扩展性,实现可插拔的效果
 *
 * 工厂模式其实就相当于创建实例对象的new
 *
 * 当有新的产品加入时,我们需要增加一个产品类继承自 {@link Shape} ,
 * 并且在 {@link ShapeStaticFactory} 中修改 {@link ShapeStaticFactory} 的 create 方法
 * 因为要修改工厂方法的代码,违反了开闭原则,这就是这个模式的缺点.而工厂方法模式就避免了这一点
 * </pre>
 * @author : zengzhijun
 * @date : 2018/5/18 14:48
 **/
public class ShapeStaticFactoryTest {


    @Test
    public void create() {
        Shape shape = ShapeStaticFactory.create(1);
        shape.draw();
        shape.erase();
        System.out.println("----------------------");
        shape = ShapeStaticFactory.create(2);
        shape.draw();
        shape.erase();


    }


}
