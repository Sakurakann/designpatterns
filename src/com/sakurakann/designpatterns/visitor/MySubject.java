package com.sakurakann.designpatterns.visitor;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.visitor.
 * User: Administrator.
 * Date: 2017-10-20 13:43.
 * Author: Haiyangp.
 */
public class MySubject implements Subject {

  private String date = null;

  @Override
  public String getSubDate() {
    return this.date;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public MySubject(String date) {
    super();
    this.date = date;
  }

  public MySubject() {
    super();
  }
}
