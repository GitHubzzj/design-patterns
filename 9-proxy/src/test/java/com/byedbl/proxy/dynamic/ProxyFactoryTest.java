package com.byedbl.proxy.dynamic;

import com.byedbl.proxy.staticmodel.UserService;
import com.byedbl.proxy.staticmodel.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.util.ClassUtils;

public class ProxyFactoryTest {

    /**
     * 代理对象不需要实现接口,但是目标对象一定要实现接口,否则不能用动态代理
     * @author : zengzhijun
     * @date : 2018/5/7 10:43
     **/
    @Test
    public void getProxyInstance() {
        // 目标对象
        UserService target = new UserServiceImpl();
        // 【原始的类型】
        System.out.println("原始的类型:"+target.getClass());

        // 给目标对象，创建代理对象
        UserService proxy = (UserService) new ProxyFactory(target).getProxyInstance();
        // class $Proxy0   内存中动态生成的代理对象
        System.out.println("内存中动态生成的代理对象:"+proxy.getClass());

        // 执行方法   【代理对象】
        proxy.save();
        proxy.delete();
        System.out.println(ClassUtils.getDescriptiveType(proxy));
    }

}
