package com.byedbl.shape.factory.method;

import com.byedbl.shape.Shape;
import org.junit.Test;
import org.springframework.util.ClassUtils;

/**
 * <pre>
 * 工厂方法模式的实现类
 * 工厂方法模式是在简单工厂的基础上将工厂也抽象出一个抽象类
 * 这样创建的工厂也实现了可插拔的效果
 * 同时也解决了简单工厂在增加产品时要修改工厂类的缺点
 *
 * 现在如果要增加一个产品,只需增加一个 {@link Shape} 接口的实现 和一个 {@link Factory}接口的实现
 *
 * 更进一步的,我们可以将 new CircleFactory() 这个过程改成反射获取,
 * 从而做到客户端无需任何修改,只要改环境配置就达到创建不同产品的效果
 *
 * @author : zengzhijun
 * @date : 2018/5/18 15:20
 **/
public class FactoryTest {

    @Test
    public void create() {

        Factory factory = new CircleFactory();
        Shape shape = factory.create();
        shape.draw();
        shape.erase();
        factory.eat();
        System.out.println("--------------");
        factory = new SquareFactory();
        shape = factory.create();
        shape.draw();
        shape.erase();
        factory.eat();
    }

    @Test
    public void createDynamic() throws ReflectiveOperationException {
        //这个值可以配置到外部文件中
        String factoryName = CircleFactory.class.getCanonicalName();
//        factoryName = SquareFactory.class.getCanonicalName();

        Class<?> clazz = ClassUtils.forName(factoryName,ClassUtils.getDefaultClassLoader());
        Factory factory = (Factory) clazz.newInstance();
        Shape shape = factory.create();
        shape.draw();
        shape.erase();
        factory.eat();

    }

}