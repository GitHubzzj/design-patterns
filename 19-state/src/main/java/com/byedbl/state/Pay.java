package com.byedbl.state;
/**
 *  A concrete state for customer shopping
 */
public class Pay extends AbstractShopState {
    private static Pay  pay ;
    static {
        pay = new Pay();
    }
    private Pay() {
    }
    public static Pay getInstance() {
        return pay;
    }
    @Override
    public void execute() {
        System.out.println("The state is pay now !");
    }
}