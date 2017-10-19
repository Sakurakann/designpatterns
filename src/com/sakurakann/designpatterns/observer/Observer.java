package com.sakurakann.designpatterns.observer;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.observer.
 * User: Administrator.
 * Date: 2017-10-18 16:31.
 * Author: Haiyangp.
 * 观察者接口.当Subject发生变化时,会接收到通知.
 */
public interface Observer {

  /**
   * Subject发生变化.
   */
  void update();

}
