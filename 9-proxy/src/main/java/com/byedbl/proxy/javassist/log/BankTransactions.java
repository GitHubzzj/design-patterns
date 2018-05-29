package com.byedbl.proxy.javassist.log;///**
// * FileName :BankTransactions
// * Author :zengzhijun
// * Date : 2018/5/7 15:29
// * Description:
// */
//package com.bydbl.proxy.javassist.log;
//
//public class BankTransactions {
//    public static void main(String[] args) {
//        BankTransactions bank = new BankTransactions();
//        for (int i = 0; i < 100; i++) {
//            String accountId = "account" + i;
//            bank.login("password", accountId, "Ashley");
//            bank.unimportantProcessing(accountId);
//            bank.withdraw(accountId, Double.valueOf(i));
//        }
//        System.out.println("Transactions completed");
//    }
//
//    @ImportantLog(fields = {"1", "2"})
//    public void login(String password, String accountId, String userName) {
//        // login logic
//    }
//
//    @ImportantLog(fields = {"0", "1"})
//    public void withdraw(String accountId, Double moneyToRemove) {
//        // transaction logic
//    }
//
//
//}
