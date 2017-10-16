package com.sakurakann.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.decorator.
 * User: Administrator.
 * Date: 2017-10-16 16:21.
 * Author: Haiyangp.
 */
public class Source implements Sourceable {

  @Override
  public void someMethod() {
    System.out.println("Method in Source original");
  }
}
