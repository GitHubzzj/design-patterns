package com.byedbl.iterator;
/**
 * Data stored in a vector
 */
import java.io.*;
import java.util.*;

import static org.springframework.util.ClassUtils.*;

public class DataVector implements Aggregate {
    private Vector data = new Vector();

    public DataVector(String fileName) {
        try {
            String absolutePath = getDefaultClassLoader().getResource(fileName).getFile();
            BufferedReader f = new BufferedReader(new FileReader(absolutePath));
            String s = f.readLine();
            while (s != null) {
                if (s.trim().length() > 0) {
                    data.add(s);
                }
                s = f.readLine();
            }
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("Can not find such file !");
        } catch (IOException e) {
            System.out.println("I/O Error !");
            System.exit(0);
        }
    }

    @Override
    public Iterator createIterator() {
        return new VectorIterator(data);
    }

}