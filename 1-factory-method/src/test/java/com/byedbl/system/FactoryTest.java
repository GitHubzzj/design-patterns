package com.byedbl.system;

import org.junit.Test;

/**
 * <pre>
 * 抽象工厂模式
 * 抽象工厂模式解决的问题是:
 * </pre>
 * <ol>
 * <li> 系统中有多于一个的产品族,比如既有 {@link Button}又有 {@link Text}
 * <li> 系统只消费其中某一族产品,比如 Windows 只消费 {@link WindowsButton} 和 {@link WindowsText}
 *    这个是一个很重要的条件,如果不是某一族,比如可能同时消费 {@link WindowsButton} 和 {@link UnixButton} ,这个时候抽象工厂也没辙了,只能用工厂方法了.
 * </ol>
 * <pre>
 * 如果不用抽象工厂方法,而用工厂方法,那么 Button 就要对应有 ButtonFactory 工厂接口,下有
 * WindowsButtonFactory 和 UnixButtonFactory 两个工厂实现类,同理 Text 也要有 TextFactory
 * 工厂接口,下有WindowTextFactory 和 UnixTextFactory 两个工厂实现类;
 *
 * 而根据上面的前提2,消费者只能消费其中一族产品,那么我们就没必要创建这么多工厂了, WindowsButtonFactory 和
 *WindowTextFactory 合并成 WindowFactory; UnixButtonFactory 和 UnixTextFactory 合并成
 *  UnixFactory ;这样就省了一组工厂类,而产品越多,省得工厂类就更多,一套一套的省.
 *
 *
 * 更进一步:
 * <ol>
 * <li> 如果Factory 动态反射获取,那么客户端就可以完全不修改而启用的产品族
 * <li> 如果 DynamicFactory 可以利用反射和配置动态创建不同环境的 {@link Button} 和 {@link Text},那么就不用 {@link WindowsFactory} 和 {@link UnixFactory} 了,这样就可以解决消费者在Windows情况下要
 *      UnixText的情况了,但是还是不能解决在Windows情况下既有{@link WindowsButton}又有 {@link UnixButton} 的问题,所以说
 *      设计模式都是解决特定问题的方案.
 * </pre>
 * @author : zengzhijun
 * @date : 2018/5/18 16:36
 **/
public class FactoryTest {

    @Test
    public void create() {
        Factory factory = new WindowsFactory();
        Button button = factory.createButton();
        Text text = factory.createText();
        button.show();
        text.display();

        System.out.println("-----------");
        factory = new UnixFactory();
        button =factory.createButton();
        text = factory.createText();
        button.show();
        text.display();


    }
}