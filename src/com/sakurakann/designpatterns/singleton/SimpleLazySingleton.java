package com.sakurakann.designpatterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.singleton.
 * User: Administrator.
 * Date: 2017-09-26 09:01.
 * Author: Haiyangp.
 */
public class SimpleLazySingleton {
  /*
   * 将构造器私有化.
   * Privatize the constructor so that others can't create it's new instance.
   */
  private SimpleLazySingleton(){}

  /*
   * 持有私有静态实例,防止被直接引用.此处赋值为null,目的是实现延迟加载.
   * Holds a private static instance to prevent a direct reference.
   * The value here is null and the purpose is to implement lazy loading.
   */
  private static SimpleLazySingleton instance = null;


  /**
   * 静态方法,创建并返回单实例.
   * Static method, create and return single instance.
   *
   * @return the single instance
   */
  public static SimpleLazySingleton getInstance() {
    if (instance == null) {
      instance = new SimpleLazySingleton();
    }
    return instance;
  }

  /**
   * 这个类可以满足基本要求，但如果我们把这种没有线程安全保护的类放入多线程的环境下，肯定就会出现问题了.
   * This class can meet the basic requirements,
   * but if we put this non-thread-protected class in a multi-threaded environment,
   * there will be a problem.
   * So,the keyword <code> synchronized </code> is used to complete it.
   * @see SyncLazySingleton.
   */

}
