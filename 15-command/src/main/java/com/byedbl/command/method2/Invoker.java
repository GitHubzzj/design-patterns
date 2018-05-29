package com.byedbl.command.method2;

/**
 *负责调用命令对象执行请求
 */
public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 这个叫行动方法
     */
    public void action() {
        command.execute();
    }
}