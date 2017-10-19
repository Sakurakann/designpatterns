package com.sakurakann.designpatterns.chainofresponsibility;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.chainofresponsibility.
 * User: Administrator.
 * Date: 2017-10-19 13:49.
 * Author: Haiyangp.
 */
public class MyHandler extends AbstractHandler implements Handler {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MyHandler() {
    super();
  }

  public MyHandler(String name) {
    super();
    this.name = name;
  }

  @Override
  public void operator() {
    if (getHandler() != null) {
      getHandler().operator();
    } else {
      System.out.println(name + " <---- has deal the opt!!");
    }
  }

  /**
   * 责任链模式:Chain of Responsibility
   * 有多个对象,每个对象持有下一个对象的引用,这样就会形成一条链,请求在这条链上传递,知道某一个对象能够处理改请求.
   * 但是请求发出这并不清除最终到底是哪个对象会处理改请求,所以,责任链模式可以实现在隐瞒客户端的情况下,
   * 对系统进行动态的调整.
   *
   * 如例所示:AbstractHandler类提供了get和set方法,方便MyHandler类设置和修改引用对象,MyHandler类是核心,实例化
   * 后生成系列相互持有的对象,构成一条链.
   *
   * 请求的传递可以是一条链,一个树,一个环,模式本身并不约束这个.请求链需要我们自己去实现.同时,在同一个时刻,请求只允许
   * 由一个对象传递给另一个对象,而不允许传递给多个对象.
   */
}
