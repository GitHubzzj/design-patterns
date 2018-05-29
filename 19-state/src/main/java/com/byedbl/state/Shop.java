package com.byedbl.state;
/**
 *  A concrete state for customer shopping
 */
public class Shop extends AbstractShopState {
    private static Shop shop;
    private Shop() {
    }
    static {
        shop = new Shop();
    }
    public static Shop getInstance() {
        return shop;
    }
    @Override
    public void execute() {
        System.out.println("The state is shopping now !");
    }
}