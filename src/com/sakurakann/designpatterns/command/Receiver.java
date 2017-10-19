package com.sakurakann.designpatterns.command;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.command.
 * User: Administrator.
 * Date: 2017-10-19 15:50.
 * Author: Haiyangp.
 */
public class Receiver {

  /**
   * 接收命令者的具体执行方式.
   */
  public void action() {
    System.out.println("Command received!!");
  }

}
