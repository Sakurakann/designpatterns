package com.sakurakann.designpatterns.factorypattern.abstractfactory;

import com.sakurakann.designpatterns.factorypattern.bean.Sender;

/**
 * Created with IntelliJ IDEA. Project: designpatterns. Package: com.sakurakann.designpatterns.factorypattern.factory.
 * User: Administrator. Date: 2017-09-22 17:01. Author: Haiyangp.
 */
public interface Producer {

  /**
   * 创建Sender的实例.
   * @return
   *          an instance belong to Sender.
   */
  Sender produce();
}
