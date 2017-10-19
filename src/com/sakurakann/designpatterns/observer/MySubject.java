package com.sakurakann.designpatterns.observer;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.observer.
 * User: Administrator.
 * Date: 2017-10-18 16:44.
 * Author: Haiyangp.
 * 主对象 有两个依赖对象,observer1和observer2.
 */
public class MySubject extends AbstractSubject {


  @Override
  public void operation() {
    System.out.println("Original has updated! Come on!!");
    notifyObservers();
  }

  /**
   * 当MySubject发生变化时,ob1和ob2必然发生变化.AbstractSubject类中持有着需要监控的对象列表,可以增加/删除
   * 被监控对象,且当MySubject发生变化时,通知到列表内存在的对象.
   * RSS订阅为其经典实现.
   */
}
