package com.byedbl.chain;
/**
 *  A member of the chain
 *  The resposibility of Programmer is coding
 */
public class Programmer implements Chain {
    private Chain nextChain = null;
    private String responsibility = "Coding";

    public Programmer() {
    }

    public void addChain(Chain c) {
        nextChain = c;
    }

    public Chain getChain() {
        return nextChain;
    }

    public void handleChain(String mesg) {
        if (mesg.equals(responsibility)) {
            System.out.println("A Programmer  -->  Coding");
        } else {
            if (nextChain != null) {
                nextChain.handleChain(mesg);
            }
        }
    }

}
