package com.byedbl.command.method2;

/**
 * <pre>
 * 客户角色,创建一个具体命令,并确定其 接收者
 *
 * 为什么不直接将Receiver注册到Invoker里面?而要先注册到Command里面?
 * 假设我们现在直接将Receiver注册到Invoker里面,那么Invoker的 action方法怎么调Receiver的方法呢?要知道Invoker是可以没有一个通用的接口的.
 * 我们发现只能重写一个Invoker了.
 * 那我们抽象一个接口,比如现在的Command,command的里面有一个给Invoker调用的方法execute,
 * 这时我们Invoker就能得到很好的重用,也符合开闭原则,
 * 当我们要调用一个其他的动作时,我们只要实现一个Command 的接口即可,实现的Command可以简单的委托给Receiver处理,
 * 极端情况也可以不要Receiver,具体的Command就处理了全部的逻辑.这时模式就变成了一堆不同命令的策略模式+一个Invoker
 *
 * 那为什么不 直接用策略模式呢?
 * 关键是多了个Invoker类,这个调用各种策略的通用类,可以说是在策略模式上更进了一步,
 * 告诉了我们怎么通用调用策略的方法(不仅仅是可以用反射)
 *
 * 用途场景:undo 功能
 */
public class CommandTest {

    @org.junit.Test
    public void execute() {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker(command);
        invoker.action();

    }
}