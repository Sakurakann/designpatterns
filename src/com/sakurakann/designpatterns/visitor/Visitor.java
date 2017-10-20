package com.sakurakann.designpatterns.visitor;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.visitor.
 * User: Administrator.
 * Date: 2017-10-20 13:40.
 * Author: Haiyangp.
 */
public interface Visitor {

  /**
   * 获取数据.
   * @param subject 数据结构
   */
  void visit(Subject subject);

  /**
   * visitor pattern: 访问者模式.
   * 访问者模式将数据结构和作用于数据上的操作解耦合,使得操作部分可相对自由地变化.
   * 访问者模式适合用于数据结构相对稳定而其对于数据的操作算法又很容易变化的系统,因为访问者模式使得数据操作增加变得容易.
   * 如果系统数据结构对象经常变化,经常有新的数据对象增加进来,则不适合使用访问者模式.
   *
   * 访问者模式的优点是增加操作很容易,因为增加操作只是意味着增加新的访问者.
   * 访问者模式将有关数据的操作行为集中到一个访问者对象中,没有影响到系统的数据结构.
   * 其缺点就是增加新的数据结构很困难.
   *
   * 简单来说,访问者模式就是一种分离对象数据结构与行为的一种模式.通过这种数据与行为的分离,可以实现被访问者(数据持有者)
   * 动态添加新的操作而无需做其它的修改.
   */

}
