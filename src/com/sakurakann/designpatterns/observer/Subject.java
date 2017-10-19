package com.sakurakann.designpatterns.observer;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.observer.
 * User: Administrator.
 * Date: 2017-10-18 16:32.
 * Author: Haiyangp.
 */
public interface Subject {

  /**
   * 增加观察者.
   * @param observer 观察者对象
   */
  void add(Observer observer);

  /**
   * 移除观察者.
   * @param observer 观察者对象
   */
  void delete(Observer observer);

  /**
   * 通知观察者.
   */
  void notifyObservers();

  /**
   * 发生变化时的操作.
   */
  void operation();

}
