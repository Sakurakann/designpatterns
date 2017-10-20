package com.sakurakann.designpatterns.visitor;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.visitor.
 * User: Administrator.
 * Date: 2017-10-20 13:38.
 * Author: Haiyangp.
 */
public interface Subject {

  /**
   * 获取数据.
   * @return 数据
   */
  String getSubDate();

  /**
   * 接收新的操作者(访问数据结构者).
   * @param visitor 访问者
   */
  void accept(Visitor visitor);

}
