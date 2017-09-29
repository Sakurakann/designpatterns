package com.sakurakann.designpatterns.factory.beanimpl;

import com.sakurakann.designpatterns.factory.bean.Sender;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.factorypattern.beanimpl.
 * User: Administrator.
 * Date: 2017-09-22 16:26.
 * Author: Haiyangp.
 */
public class SmsSender implements Sender {

  public SmsSender() {
    super();
    System.out.println("An instance for SmsSender has been created");
  }

  /**
   * 实现发送数据.
   */
  @Override
  public void send() {
    System.out.println("Send-Method in SmsSender");
  }
}
