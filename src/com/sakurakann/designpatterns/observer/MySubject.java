package com.sakurakann.designpatterns.observer;

/**
 * Created with IntelliJ IDEA. Project: designpatterns. Package: com.sakurakann.designpatterns.observer.
 * User: Administrator. Date: 2017-10-18 16:44. Author: Haiyangp.
 */
public class MySubject extends AbstractSubject {


  @Override
  public void operation() {
    System.out.println("Original has updated! Come on!!");
    notifyObservers();
  }
}
