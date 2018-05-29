package com.byedbl.state;

/**
 *  A state interface
 *  用户在网上购物的状态变化:
 *  选择商品 --> 生成订单 --> 付款取货
 */
public interface ShopState {
    void execute();
    void changeState(ShopContext c, AbstractShopState shopState);
}