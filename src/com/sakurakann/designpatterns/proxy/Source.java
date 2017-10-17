package com.sakurakann.designpatterns.proxy;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.proxy.
 * User: Administrator.
 * Date: 2017-10-17 09:17.
 * Author: Haiyangp.
 */
public class Source implements Sourceable {

  @Override
  public void method() {
    System.out.println("original method!");
  }
}
