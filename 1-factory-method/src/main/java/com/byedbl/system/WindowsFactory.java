/**
 * FileName :WindowsFactory
 * Author :zengzhijun
 * Date : 2018/5/18 16:33
 * Description:
 */
package com.byedbl.system;

public class WindowsFactory implements Factory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Text createText() {
        return new WindowsText();
    }
}
