package com.sakurakann.designpatterns.observer;

import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.observer.
 * User: Administrator.
 * Date: 2017-10-18 16:36.
 * Author: Haiyangp.
 */
public abstract class AbstractSubject implements Subject {

  /**
   * 持有观察者对象列表.
   */
  private Vector<Observer> observers = new Vector<Observer>(10);

  @Override
  public void add(Observer observer) {
    observers.add(observer);
  }

  @Override
  public void delete(Observer observer) {
    observers.remove(observer);
  }

  @Override
  public void notifyObservers() {
    for (Observer observer : observers) {
      observer.update();
    }
  }

  public abstract void operation();
}
