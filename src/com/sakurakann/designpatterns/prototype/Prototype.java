package com.sakurakann.designpatterns.prototype;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.prototype.
 * User: Administrator.
 * Date: 2017-09-26 15:00.
 * Author: Haiyangp.
 */
public class Prototype implements Cloneable {

  @Override
  public Object clone() throws CloneNotSupportedException {
    Prototype prototype = (Prototype) super.clone();
    return prototype;
  }

}
