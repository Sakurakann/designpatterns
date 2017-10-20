package com.sakurakann.designpatterns.memento;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.memento.
 * User: Administrator.
 * Date: 2017-10-20 10:13.
 * Author: Haiyangp.
 */
public class Storage {
  private Memento memento = null;

  /**
   * Instantiates a new Storage.
   *
   * @param memento the memento
   */
  public Storage(Memento memento) {
    super();
    this.memento = memento;
  }

  public Storage() {
    super();
  }

  public Memento getMemento() {
    return memento;
  }

  /**
   * Memento pattern:备忘录模式
   * 主要目的是为了保存一个对象的某个状态,以便在适当的时候恢复该对象.叫备份模式更恰当.
   * 有原始类Original,O中有各种属性,O中有方法可以决定需要备份的属性.
   * 备忘录类Memento,M是用来存储O的一些属性值,可以提供带参数的构造方法.
   * 存储类Storage,S是用来存储M类的,持有M类的对象,且只提供存储,不提供修改.
   *
   * 该模式准确应该叫"备份-恢复"模式.
   * @see MementoTest
   */

}
