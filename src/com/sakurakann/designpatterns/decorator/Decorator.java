package com.sakurakann.designpatterns.decorator;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.decorator.
 * User: Administrator.
 * Date: 2017-10-16 16:22.
 * Author: Haiyangp.
 */
public class Decorator implements Sourceable {

  private Sourceable source;

  public Decorator(Sourceable source) {
    super();
    this.source = source;
  }

  public Decorator() {
    super();
  }

  @Override
  public void someMethod() {
    System.out.println("before decorator!");
    source.someMethod();
    System.out.println("after decorator!");
  }

  /**
   * 装饰模式就是给一个独享增加一些新的功能,而且是动态的,要求装饰对象和被装饰对象实现同一个接口,
   * 装饰对象持有被装饰对象的实例.
   *
   * Decorating mode is to add some new features to a unique and dynamic.
   * The decorator object is required to implement the same interface as the decorated object,
   * which holds the instance of the decorated object.
   *
   * 应用场景:1 需要扩展一个类的功能.2 动态的为一个对象增加功能,可以动态撤销.
   * 缺点: 产生过多相似的对象,不容易排查错误.
   *
   * Application scenario: 1 needs to extend the function of a class.
   * 2 dynamic function for an object can be revoked dynamically.
   * Disadvantages: too many similar objects, not easy to check errors.
   */
}
