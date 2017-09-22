package com.sakurakann.designpatterns.factorypattern.beanimpl;

import com.sakurakann.designpatterns.factorypattern.bean.Sender;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.factorypattern.beanimpl.
 * User: Administrator.
 * Date: 2017-09-22 16:21.
 * Author: Haiyangp.
 */
public class MailSender implements Sender {

  public MailSender() {
    super();
    System.out.println("An instance for MailSender has been created");
  }

  /**
   * 实现发送数据.
   */
  @Override
  public void send() {
    System.out.println("Send-Method in MailSender");
  }
}
