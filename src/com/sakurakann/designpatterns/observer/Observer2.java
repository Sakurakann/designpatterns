package com.sakurakann.designpatterns.observer;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.observer.
 * User: Administrator.
 * Date: 2017-10-18 16:42.
 * Author: Haiyangp.
 */
public class Observer2 implements Observer {

  @Override
  public void update() {
    System.out.println("Observer2 has updated!");
  }
}
