package com.sakurakann.designpatterns.builder;

import com.sakurakann.designpatterns.factorypattern.bean.Sender;
import com.sakurakann.designpatterns.factorypattern.beanimpl.MailSender;
import com.sakurakann.designpatterns.factorypattern.beanimpl.SmsSender;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.<br/>
 * Project: designpatterns.<br/>
 * Package: com.sakurakann.designpatterns.builder.<br/>
 * User: Administrator.<br/>
 * Date: 2017-09-26 14:31.<br/>
 * Author: Haiyangp.<br/>
 * 工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象.
 * 所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的.
 * <br/>
 * The factory pattern is to create a single class provided by the model, and the builder pattern
 * is to manage all kinds of product together, used to create a composite object.
 * A composite object is refers to a class with different attributes, actually the builder pattern
 * is in front of the abstract factory pattern and combine the final Test.
 */
public class Builder {

  private List<Sender> senders = new ArrayList<>(20);

  /**
   * Produce mail sender integer.
   *
   * @param count the count
   * @return the integer
   */
  public Integer produceMailSender(Integer count) {
    for (int i = 0;i < count;i++) {
      this.senders.add(new MailSender());
    }
    return count;
  }

  /**
   * Produce sms sender integer.
   *
   * @param count the count
   * @return the integer
   */
  public Integer produceSmsSender(Integer count) {
    for (int i = 0;i < count;i++) {
      this.senders.add(new SmsSender());
    }
    return count;
  }
}
