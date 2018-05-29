package com.byedbl.template;

/**
 *  模板方法模式
 *  An abstract class which can get content from a file or a HTTP URL
 *  or other resource
 *  抽象类实现部分逻辑并定义抽象方法迫使子类实现剩余的逻辑,
 *  不同的子类只需完成抽象方法的不同实现,但是整个通用的逻辑已经在父类实现
 */
public abstract class AbstractRead {
    protected String resource;

    /**
     * <pre>
     * 定义个模板方法,完成功能逻辑骨架,具体实现留到子类去实现
     * 完成逻辑的抽象
     **/
    public void getContent() {
        if(open()) {
            readContent();
            close();
        }
    }
    public void setResource(String s) {
        resource = s;
    }

    /**
     * 定义子类需要实现的抽象方法
     **/
    protected abstract boolean open();
    protected abstract void readContent();
    protected abstract void close();
}