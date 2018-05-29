package com.byedbl.state;

/**
 *  The context for user useing
 */
public class ShopContext  {
    private ShopState currentState;
    public ShopContext() {
    }
    public void changeState(ShopState s) {
        currentState = s;
    }
    public void shop() {
        currentState.execute();
    }
    public void generateBill() {
        currentState.execute();
    }
    public void pay() {
        currentState.execute();
    }
}