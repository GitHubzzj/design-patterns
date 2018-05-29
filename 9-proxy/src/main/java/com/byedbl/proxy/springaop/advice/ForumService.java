/**
 * FileName :ForumService
 * Author :zengzhijun
 * Date : 2018/5/8 10:01
 * Description:异常增强服务类
 */
package com.byedbl.proxy.springaop.advice;

public class ForumService   {

    public void remove(int id) {
        throw new RuntimeException(""+id);
    }

    public int update(int id) {
        throw new RuntimeException("" + id);
    }
}
