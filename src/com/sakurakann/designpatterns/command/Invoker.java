package com.sakurakann.designpatterns.command;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.command.
 * User: Administrator.
 * Date: 2017-10-19 15:48.
 * Author: Haiyangp.
 */
public class Invoker {

  /**
   * 传递的命令.
   */
  private Command command;

  public Invoker() {
    super();
  }

  public Invoker(Command command) {
    this.command = command;
  }

  /**
   * 想要做的事情,即命令被执行并得到一定的结果.
   */
  public void action() {
    command.exec();
  }

  /**
   * command : 命令模式
   * 命令模式相当于司令员传口令让士兵做一些事情.
   * 司令员的作用是发出口令,口令经过传递给士兵后,士兵按照口令的内容去完成一定的任务.
   * 这个过程中,三者相互解耦,任何一方都不需要去依赖其他人,只要做好自己的事情就好了.
   * 司令要的是结果,不去理会具体的完成者,口令是传递,士兵只需要根据口令完成任务.
   *
   * Invoker是调用者(司令),Receiver是被调用者(士兵),MyCommand是命令,实现了Command接口,持有接收对象.
   *
   * 命令模式的目的就是达到命令的发出者和执行者之间解耦,实现请求和执行分开.
   * Struts其实就是一种将请求和呈现分离的技术,其中必然涉及命令模式的思想！
   */

}
