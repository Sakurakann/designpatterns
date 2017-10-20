package com.sakurakann.designpatterns.Mediator;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.Mediator.
 * User: Administrator.
 * Date: 2017-10-20 15:18.
 * Author: Haiyangp.
 */
public class ChatRoom {

  public void showMessage(User user,String message) {
    System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
  }

  /**
   * mediator pattern: 中介者模式.
   * 聊天室是其经典实现.在聊天室中,两个成员相互聊天,简单的做法是相互持有对方的实例.当发送信息时,一方的实例发生变化,
   * 另一方也会相应变化.当成员量少时是没有问题的,但是当有多个成员时,相互持有构成网状结构实例,这不利于程序的开发和维护,
   * 而且类与类之间有相当严重的耦合关系.(多个成员相当于同事)
   *
   * 中介者模式就是用来解决同事类之间的耦合关系的.
   * 中介者使各对象不需要显式地相互引用,从而使其耦合松散,而且可以独立地改变它们之间的交互.
   */

}
