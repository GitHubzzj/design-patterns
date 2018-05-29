package com.byedbl.state;

/**
 *  A test client
 */
public class Test  {
    public static void main(String[] args) {
        ShopContext myContext = new ShopContext();
        AbstractShopState myShop = Shop.getInstance();
        AbstractShopState myGenBill = GenerateBill.getInstance();
        AbstractShopState myPay = Pay.getInstance();
        
        myContext.changeState(myShop);
        myContext.shop();

        myContext.changeState(myGenBill);
        myContext.generateBill();
        
        myContext.changeState(myPay);
        myContext.pay();

        myShop.changeState(myContext, myPay);
        myContext.pay();
    }
}