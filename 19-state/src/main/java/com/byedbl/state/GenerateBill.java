package com.byedbl.state;
/**
 *  A concrete state for generating bill
 */
public class GenerateBill extends AbstractShopState {
    private static GenerateBill generateBill;
    static {
        generateBill = new GenerateBill();
    }

    private GenerateBill() {
    }
    public static GenerateBill getInstance() {
        return generateBill;
    }
    @Override
    public void execute() {
        System.out.println("The state is generating bill now !");
    }
}
