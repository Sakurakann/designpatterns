package com.sakurakann.designpatterns.singleton;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.singleton.
 * User: Administrator.
 * Date: 2017-09-26 09:19.
 * Author: Haiyangp.
 */
public class SyncLazySingleton {

  private SyncLazySingleton(){}

  private static SyncLazySingleton instance = null;


  /**
   * Gets instance sync.
   *
   * @return the single instance
   */
  public static synchronized SyncLazySingleton getInstance() {
    if (instance == null) {
      instance = new SyncLazySingleton();
    }
    return instance;
  }

  /**
   * synchronized关键字锁住的是这个实例，这样的用法在性能上会有所下降，因为每次调用getInstance()，都要对对象上锁，
   * 事实上，只有在第一次创建对象的时候需要加锁，以后就不需要了.所以，这个地方需要改进。我们改成下面这个:
   * <p></p>
   * The synchronized keyword is locked this Instance, such usage will decline in performance,
   * because each call getInstance(), the object will be locked.
   * in fact, only in creating objects for the first time need to lock, later don't need.
   * So, this place needs to improve. Let's change this to this:
   *
   * @return the single instance
   */
  public static SyncLazySingleton getInstance1() {
    if (instance == null) {
      synchronized (instance) {
        if (instance == null) {
          instance = new SyncLazySingleton();
        }
      }
    }
    return instance;
  }

  /**
   * 解决了之前提到的问题，将synchronized关键字加在了内部，也就是说当调用的时候是不需要加锁的，
   * 只有在instance为null，并创建对象的时候才需要加锁，性能有一定的提升。
   * 但是,在Java指令中创建对象和赋值操作是分开进行的.
   * 也就是说instance = new Singleton();语句是分两步执行的,JVM并不能保证这两个操作的先后顺序.
   *
   * Solve the problem mentioned earlier, the synchronized keyword in the interior,
   * that is mean the call is not to need to lock, only when the instance is null,
   * and the need to lock when creating an object, performance improvement.
   * However...the object and assignment operations are created separately in the Java directive.
   * Statements are executed in two steps, but the JVM does not guarantee the sequence
   * of the two operations.
   * So...we can further optimize the program:
   * @see HungrySingleton.
   */

}
