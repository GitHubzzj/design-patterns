package com.byedbl.visitor.sample1;

public abstract class Visitor
{
  public abstract void visit(Employee emp); 
  public abstract void visit(Boss emp); 
}
