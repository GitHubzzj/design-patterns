package com.byedbl.chain;
/**
 *  A member of the chain
 *  The resposibility of QA is test
 */
public class QA implements Chain {
    private Chain nextChain = null;
    private String responsibility = "Test";

    public QA() {
    }

    public void addChain(Chain c) {
        nextChain = c;
    }

    public Chain getChain() {
        return nextChain;
    }

    public void handleChain(String mesg) {
        if (mesg.equals(responsibility)) {
            System.out.println("A QA  -->  Test");
        } else {
            if (nextChain != null) {
                nextChain.handleChain(mesg);
            }
        }
    }

}