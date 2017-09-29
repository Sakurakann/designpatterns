package com.sakurakann.designpatterns.factory.factory;

import com.sakurakann.designpatterns.factory.bean.Sender;
import com.sakurakann.designpatterns.factory.beanimpl.MailSender;
import com.sakurakann.designpatterns.factory.beanimpl.SmsSender;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.factorypattern.normalFactory.
 * User: Administrator.
 * Date: 2017-09-22 16:31.
 * Author: Haiyangp.
 */
public class SendInstanceProducer {

  public SendInstanceProducer() {
    super();
  }

  /**
   * Produce sender.
   * Create an instance for someone who implements Sender.
   *
   * @param type
   *         the instance type String,
   * @return the sender instance
   */
  public Sender produce(String type) {
    if ("mail".equalsIgnoreCase(type)) {
      return new MailSender();
    } else if ("sms".equalsIgnoreCase(type)) {
      return new SmsSender();
    }
    return null;
  }
}
