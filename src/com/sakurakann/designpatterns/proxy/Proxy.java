package com.sakurakann.designpatterns.proxy;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.proxy.
 * User: Administrator.
 * Date: 2017-10-17 09:18.
 * Author: Haiyangp.
 * static proxy!one to one.
 */
public class Proxy implements Sourceable {

  private Source source;

  public Proxy() {
    super();
    this.source = new Source();
  }

  @Override
  public void method() {
    before();
    source.method();
    after();
  }

  private void before() {
    System.out.println("Proxy before");
  }

  private void after() {
    System.out.println("Proxy after");
  }

  /**
   * (静态)代理模式应用场景:如果已有的方法在使用时需要对原有方法进行改进,此时有两种解决办法:
   * 1 修改原有的方法来适应,但这样违反了"对扩展开放,对修改关闭"的原则.
   * 2 采用一个代理调用原有的方法,且对产生的结果进行控制,这种方法就是代理模式.使用代理模式,可以将功能划分的更加清晰.
   * 代理模式就是多一个代理类出来,代替原对象进行一些操作.
   */
}
