/**
 * FileName :UnixFactory
 * Author :zengzhijun
 * Date : 2018/5/18 16:32
 * Description:
 */
package com.byedbl.system;

public class UnixFactory implements Factory {
    @Override
    public Button createButton() {
        return new UnixButton();
    }

    @Override
    public Text createText() {
        return new UnixText();
    }
}
