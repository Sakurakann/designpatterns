package com.sakurakann.designpatterns.factorypattern.factory;

import com.sakurakann.designpatterns.factorypattern.bean.Sender;
import com.sakurakann.designpatterns.factorypattern.beanimpl.MailSender;
import com.sakurakann.designpatterns.factorypattern.beanimpl.SmsSender;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.factorypattern.normalFactory.
 * User: Administrator.
 * Date: 2017-09-22 16:47.
 * Author: Haiyangp.
 */
public class MultipleInstanceProducer {

  public MultipleInstanceProducer() {
    super();
  }

  /**
   * Mail sender produce sender.
   *
   * @return the MailSender instance
   */
  public Sender mailSenderProduce() {
    return new MailSender();
  }

  /**
   * Sms sender produce sender.
   *
   * @return the SmsSender instance
   */
  public Sender smsSenderProduce() {
    return new SmsSender();
  }


  /**
   * this function can be static for convenient to call
   */
  /*public static Sender mailSenderProduce() {
    return new MailSender();
  }

  public static Sender smsSenderProduce() {
    return new SmsSender();
  }*/

}
