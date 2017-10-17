package com.sakurakann.designpatterns.facade;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.facade.
 * User: Administrator.
 * Date: 2017-10-17 10:03.
 * Author: Haiyangp.
 */
public class Computer {

  private Cpu cpu = null;
  private Memory memory = null;
  private Disk disk = null;

  /**
   * Instantiates a new Computer.
   */
  public Computer() {
    super();
    this.cpu = new Cpu();
    this.memory = new Memory();
    this.disk = new Disk();
  }

  /**
   * Startup.
   */
  public void startup() {
    System.out.println("start the computer");
    cpu.startup();
    memory.startup();
    disk.startup();
    System.out.println(">");
    System.out.println(">>");
    System.out.println(">>>\n\rstart computer finished\n\r");
  }

  /**
   * Shutdown.
   */
  public void shutdown() {
    System.out.println("shutdown the computer");
    cpu.shutdown();
    memory.shutdown();
    disk.shutdown();
    System.out.println(">");
    System.out.println(">>");
    System.out.println(">>>\n\rshutdown computer finished!\n\r");
  }

  /**
   * facade 外观模式.
   * computer是cpu\memory\disk的外观.
   * 外观模式是为了解决类与类之间的依赖关系,像spring一样,可以将类和类之间的关系配置到一个facade类中,
   * 降低类之间的耦合度,该模式中没有涉及到接口.
   *
   * 如果没有computer外观类,那么cpu\memory\disk之间在使用时将会相互持有实例,产生关系,这样会造成严重的依赖.
   * 修改一个类可能会附带其他类的修改.有了computer类,他们之间的关系被放在了computer facade类中,这样就起到了解耦.
   * 解耦后修改单个类不会引起关联类的太多变化.这正是我们想要的.
   */

}
