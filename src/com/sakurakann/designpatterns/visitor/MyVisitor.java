package com.sakurakann.designpatterns.visitor;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.visitor.
 * User: Administrator.
 * Date: 2017-10-20 13:43.
 * Author: Haiyangp.
 */
public class MyVisitor implements Visitor {

  @Override
  public void visit(Subject subject) {
    System.out.println("visit the date ...  value -->" + subject.getSubDate());
  }
}
