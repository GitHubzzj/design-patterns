package com.byedbl.template;

/**
 *  A test client
 */
public class Test  {
    @org.junit.Test
    public void test() {
        String fileName = "test.txt";
        String url = "http://www.baidu.com";

        AbstractRead fileRead = new ReadFile();
        AbstractRead htmlRead = new ReadHtml();

        fileRead.setResource(fileName);
        htmlRead.setResource(url);

        System.out.println("-----  Read from a file  -----");
        fileRead.getContent();
        System.out.println("-----  Read from a url  -----");
        htmlRead.getContent();

    }
}