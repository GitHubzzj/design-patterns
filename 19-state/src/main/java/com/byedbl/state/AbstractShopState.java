package com.byedbl.state;

/**
 *  The parent class of state
 */
public abstract class AbstractShopState implements ShopState {
    public AbstractShopState() {
    }
    @Override
    public void changeState(ShopContext c, AbstractShopState s) {
        c.changeState(s);
    }
}