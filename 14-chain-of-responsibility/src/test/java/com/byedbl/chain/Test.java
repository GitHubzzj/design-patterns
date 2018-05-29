package com.byedbl.chain;
/**
 *  A client to test
 */
public class Test  {
    public static void main(String[] args) {
        Manager aManager = new Manager();
        ProjectManager aPM = new ProjectManager();
        Programmer aProgrammer = new Programmer();
        QA aQA = new QA();
        Others others = new Others();

        aManager.addChain(aPM);
        aPM.addChain(aProgrammer);
        aProgrammer.addChain(aQA);
        aQA.addChain(others);

        aManager.handleChain("Get Project");
        aManager.handleChain("Design");
        aManager.handleChain("Coding");
        aManager.handleChain("Test");
        aManager.handleChain("Kill La Deng !");
    }
}