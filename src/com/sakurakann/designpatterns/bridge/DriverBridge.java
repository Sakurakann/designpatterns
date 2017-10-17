package com.sakurakann.designpatterns.bridge;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.bridge.
 * User: Administrator.
 * Date: 2017-10-17 11:02.
 * Author: Haiyangp.
 */
public class DriverBridge implements Driver {

  private Driver driver = null;

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  @Override
  public void getConn() {
    driver.getConn();
  }

  /**
   * JDBC实现方式,桥接模式.
   * DriverBridge相当于DriverManger.
   * 桥接模式把事物和其具体实现分开,使他们可以各自独立的变化.桥接的用意是:将抽象化与实现化解耦,使得二者可以独立变化.
   * 经典实现JDBC桥DriverManager:JDBC进行连接数据库时,在各个数据库之间进行切换,基本上不用动太多代码,甚至丝毫不动,
   * 原因就是JDBC提供统一接口,每个数据库提供各自的实现,再用一个叫做数据库驱动的程序来进行桥接.
   */
}
