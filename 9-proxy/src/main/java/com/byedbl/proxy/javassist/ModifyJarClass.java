/**
 * FileName :ModifyJarClass
 * Author :zengzhijun
 * Date : 2018/5/7 15:39
 * Description:
 */
package com.byedbl.proxy.javassist;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;

public class ModifyJarClass {

    public static void main(String[] args) throws Exception {
        ClassPool pool = ClassPool.getDefault();

        //设置目标类的路径，确保能够找到需要修改的类，这里我指向firestorm.jar
        //解包后的路径
        pool.insertClassPath("D:\\c2f-web-common") ;

        //获得要修改的类
        CtClass cc = pool.get("com.c2f.common.adapter.DateAdapter");
        //设置方法需要的参数
        CtClass[] param = new CtClass[3] ;
        param[0] = pool.get("java.lang.String") ;
//        param[1] = pool.get("byte[]") ;
//        param[2] = pool.get("byte[]") ;

        //得到方法
        CtMethod m = cc.getDeclaredMethod("unmarshal", param);
        //插入新的代码
        m.insertBefore("{return true ;}") ;
        //保存到文件里
        cc.writeFile() ;
    }
}
