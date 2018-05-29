# design-patterns
23中设计模式源码

- #### 设计模式分3类:

- ###### 创建型5种:
工厂方法模式，抽象工厂模式，单例模式，原型模式，建造者模式



- ###### 结构型7种:

适配器模式，装饰器模式，组合模式，代理模式﻿，桥接模式﻿，享元模式，外观模式



- ###### 行为型11种:

策略模式，模板方法模式，责任链模式，命令模式，迭代子模式，观察者模式，备忘录模式，访问者模式，中介模式，状态模式，解析器模式



- **另外还两种冒充的**:并发型模式，线程池模式





- #### 设计总原则

##### 开闭原则

对扩展开放，对修改封闭
在不修改已有的代码前提下对功能进行扩展


1. ###### 单一职责原则

目标:高内聚，低耦合

说人话:一个类只负责做自己的事情



2. ###### 里氏替换原则

用到父类的地方都可以用任何一个子类替换，

要点:不要随意通过覆写改变父类定义的行为



3. ###### 接口隔离原则

当不是所有的子类都必须实现某一个方法时就不要放在一个接口里面了，拆成两个



4. ###### 依赖倒转原则

传说中的面向接口编程

说人话:当要用到某个类时不要直接用这个类，而是用它的接口，以后想变实现就变啦





5. ###### 最小知道原则 迪米特原则

一个类应该尽量少和其他类有关联，比如:聚合，组合，关联，依赖，

这样别的类修改了就能对我影响的最小啦



6. ###### 合成复用原则

组合聚合优先，继承靠后

说明写：解决什么问题，用的场景

- ##### 创建型模式(**5种**):
|模式名称|说明|链接|
|--|--|--|
|工厂方法模式|实现类太多,有时不知道具体创建哪一个实现类,故将实际的创建工作推迟到子类中,工厂可配置到外部去|[前往查看](https://www.jianshu.com/p/40455fde92a7)|
|抽象工厂模式|一个工厂创建**一个产品族**|[前往查看](https://www.jianshu.com/p/40455fde92a7)|
|单例模式|确保一个类在整个系统中只有一个实例,注意线程安全|[前往查看](https://www.jianshu.com/p/4d0d01cd155d)|
|建造者模式|包工头的故事,复杂的创建与表示分离|[前往查看](https://www.jianshu.com/p/9cf43e0ecfe0)|
|原型模式|将创建的对象缓存起来,要的时候`clone`一个|[点我](https://www.jianshu.com/p/93d375f36a75)|

- ##### 结构型模式(**7种**):
|模式名称|说明|链接|
|--|--|--|
|适配器模式|指方为圆,慎用|[查看详情](https://www.jianshu.com/p/db456cbf489c)|
|桥接模式|解决抽象和实现类都要变化的问题<br>一个产品有两个维度的抽象,在其中一个抽象中聚合另一个抽象使之关联起来|[点击查看](https://www.jianshu.com/p/f41339729826)|
|组合模式|树形结构,单个对象和组合对象具有相同的使用方法,在合适的地方提供管理子类的方法(增删改查)|[前往查看](https://www.jianshu.com/p/6d65a2142f65)|
|装饰器模式|动态的给对象增加功能,比继承更灵活|[GO](https://www.jianshu.com/p/5f4193b26629)|
|代理模式|提供个代理**控制**对这个对象的访问|[看一看](https://www.jianshu.com/p/861ce5213f87)|
|外观模式|提供一个统一的高层次接口,简化和子系统的交互|[瞄一瞄](https://www.jianshu.com/p/32d2b91d0c94)|
|享元模式|以共享的方式高效地支持大量细粒度对象,分内蕴和外蕴状态,注意线程安全问题|[点它](https://www.jianshu.com/p/7e31ecf949a0)|

- ##### 行为型模式(**11种**):
|模式名称|说明|链接|
|--|--|--|
|策略模式|算法替换,一个抽象多个实现类|[查看](https://www.jianshu.com/p/c8940d3ffd56)|
|模板方法|定义算法的**骨架**,让子类实现细节|[点之](https://www.jianshu.com/p/ca7efcca602d)|
|责任链模式|每一个对象都有其下家的引用,这样就可以形成一条链,使多个对象都有机会处理该请求|[单击](https://www.jianshu.com/p/20966375aae5)|
|命令模式|1. 把一个请求或操作封装在命令对象中,调用者Invoker只管调命令,具体执行是找命令对象<br>2. 命令对象Command是传递的,接收者Receiver是真正干活的,也可无Receiver<br>3. 可实现命令的撤销和恢复功能|[读一读](https://www.jianshu.com/p/fd0e03e6a289)|
|迭代子模式|访问容器中各个元素而不需暴露对象的内部细节,迭代的算法可以独立于聚集角色变化(和桥接模式类似)|[看一看](https://www.jianshu.com/p/97400d8b8d71)|
|观察者模式|一个对象改变通知其他的订阅者|[前往查看](https://www.jianshu.com/p/ee5a617a54b0)|
|备忘录模式|不破坏封装前提下,将捕获的对象内部状态保存到其他地方以便后面恢复,<br>备忘录模式存储状态,命令模式实现撤销功能|[点一下](https://www.jianshu.com/p/c67ed111a7ad)|
|状态模式|不同的状态有不同的行为,和策略模式的区别在于环境角色会改变状态|[点一点](https://www.jianshu.com/p/713b10995d5f)|
|访问者模式|在不改变已经定义的数据结构(例:Computer,Mouse)前提下,通过Visitor定义对各元素的新操作|[瞄一眼](https://www.jianshu.com/p/2cce0e7958ca)|
|解析器模式|创建一种语言|[阅一阅](https://www.jianshu.com/p/4bef6c9c499d)|
|中介模式|通过一个中介对象解耦,该模式优劣参半|[了解一下](https://www.jianshu.com/p/c4d430f57caa)|


---

- ###### 组合聚合区别

>聚合关系是“has-a”关系，组合关系是“contains-a”关系；组合中一旦删除了组合对象，同时也就删除了代表部分事物的对象。﻿比如心脏和你是组合的，属于你的一部分。所以组合是强关联。



- ###### 依赖，关联，聚合 关系与区别
>依赖关系是五种关系中耦合最小的一种关系,类A的某个成员**方法的返回值、形参、局部变量或静态方法**调用了B类，则表示类A依赖类B

>发生关联关系的两个类，**类A成为类B的属性**，而属性是一种更为紧密的耦合，更为长久的持有关系,比如学生和老师

>聚合用来表示**集体与个体**之间的关联关系。例如班级与学生之间存在聚合关系

![类图关系图.png](https://upload-images.jianshu.io/upload_images/9211971-e3bbcb9befa6ca58.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


[参考博文](https://blog.csdn.net/K346K346/article/details/59582926)

有疑问联系作者：
QQ：2537646458

