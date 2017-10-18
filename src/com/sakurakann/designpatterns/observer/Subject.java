package com.sakurakann.designpatterns.observer;

/**
 * Created with IntelliJ IDEA. Project: designpatterns. Package: com.sakurakann.designpatterns.observer.
 * User: Administrator. Date: 2017-10-18 16:32. Author: Haiyangp.
 */
public interface Subject {

  void add(Observer observer);

  void delete(Observer observer);

  void notifyObservers();

  void operation();

}
