package com.byedbl.template;
/**
 * A concrete class extends AbstractRead
 * This class can read from a file
 */
import org.springframework.util.ClassUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 一种实现,读文本
 * @author : zengzhijun
 * @date : 2018/5/25 13:57
 **/
public class ReadFile extends AbstractRead {
    private BufferedReader in = null;

    public ReadFile() {
    }

    public ReadFile(String fileName) {
        resource = fileName;
    }

    protected boolean open() {
        try {
            String file = ClassUtils.getDefaultClassLoader().getResource(this.resource).getFile();

            in = new BufferedReader(new FileReader(file));
        } catch (IOException e) {
            System.out.println("Can not open file!");
            return false;
        }
        return true;
    }

    protected void readContent() {
        try {
            if (in != null) {
                String str;
                while ((str = in.readLine()) != null) {
                    System.out.println(str);
                }
            }
        } catch (IOException e) {
            System.out.println("Read file error !");
        }
    }

    protected void close() {
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                System.out.println("IO error !");
            }
        }
    }
}