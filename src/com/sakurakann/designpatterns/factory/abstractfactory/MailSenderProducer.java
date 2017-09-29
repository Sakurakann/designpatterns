package com.sakurakann.designpatterns.factory.abstractfactory;

import com.sakurakann.designpatterns.factory.bean.Sender;
import com.sakurakann.designpatterns.factory.beanimpl.MailSender;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.factorypattern.abstractfactory.
 * User: Administrator.
 * Date: 2017-09-22 17:05.
 * Author: Haiyangp.
 */
public class MailSenderProducer implements Producer {

  /**
   * 创建Sender的实例.
   *
   * @return an instance belong to Sender.
   */
  @Override
  public Sender produce() {
    return new MailSender();
  }
}
