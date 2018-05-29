package com.byedbl.composite;
/*
 *  A Component with some common function implementation
 *
 */
import java.util.*;

public class Employee implements Component {
    private String name;
    private float salary;
    private Vector subordinates;
    private boolean isLeaf;
    private Employee parent = null;


    public Employee(String _name, float _salary) {
        name = _name;
        salary = _salary;
        subordinates = new Vector();
        isLeaf = false;
    }

    public Employee(Employee _parent, String _name, float _salary) {
        name = _name;
        salary = _salary;
        parent = _parent;
        subordinates = new Vector();
        isLeaf = false;
    }

    @Override
    public void setLeaf(boolean b) {
        isLeaf = b;
        //if true, do not allow children
    }

    @Override
    public float getSalary() {
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean add(Employee e) {
        if (! isLeaf) { 
            subordinates.addElement(e);
        }
        return isLeaf;
        //false if unsuccessful
    }

    @Override
    public void remove(Employee e) {
        if (! isLeaf) {
            subordinates.removeElement(e);
        }
    }

    @Override
    public Enumeration elements() {
        return subordinates.elements();
    }

    @Override
    public Employee getChild(String s) {
        Employee newEmp = null;

        if(getName().equals(s)) {
            return this;
        } else {
            boolean found = false;
            Enumeration e = elements();
            while(e.hasMoreElements() && (! found)) {  
                newEmp = (Employee)e.nextElement();
                found = newEmp.getName().equals(s);
                if (! found) {
                    newEmp = newEmp.getChild(s);
                    found =(newEmp != null);
                }
            }
            if (found) {
                return newEmp;
            } else {
                return null;
            }
        }
    }

    @Override
    public float getSalaries() {
        float sum = salary;
        for(int i = 0; i < subordinates.size(); i++) {
            sum += ((Employee)subordinates.elementAt(i)).getSalaries();
        }
        return sum;
    }
    
}