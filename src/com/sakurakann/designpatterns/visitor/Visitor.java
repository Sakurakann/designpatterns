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

}
