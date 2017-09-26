package com.sakurakann.designpatterns.singleton;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.singleton.
 * User: Administrator.
 * Date: 2017-09-26 09:39.
 * Author: Haiyangp.
 */
public class HungrySingleton implements Serializable {

  private static final long serialVersionUID = 1L;

  private HungrySingleton() {
  }

  private static HungrySingleton instance = new HungrySingleton();

  /**
   * Gets instance.
   *
   * @return the instance
   */
  public static HungrySingleton getInstance() {
    return instance;
  }


  /**
   * we can use static inner class to make it more perfect.
   */
  private static class SingletonFactory {

    private static HungrySingleton _instance = new HungrySingleton();
  }

  /**
   * we can use static inner class to make it more perfect.
   *
   * @return single instance
   */
  public static HungrySingleton get_instance() {
    return SingletonFactory._instance;
  }

  /**.
   * If the single instance can be Serialized, use this method to make sure instance
   * be consistent before and after serialization.
   * eg:...after get instance from deserialization <code> instance == instance.readResolve()?</code>
   *
   * @return single instance
   */
  public Object readResolve() {
    return getInstance();
  }

}
