package com.sakurakann.designpatterns.iterator;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.iterator.
 * User: Administrator.
 * Date: 2017-10-19 10:52.
 * Author: Haiyangp.
 */
public interface Iterator<E> {

  /**
   * 是否有下一个元素.
   * @return true Y/false N
   */
  boolean hasNext();

  /**
   * 返回第一个元素.
   * @return 第一个元素 E
   */
  E first();

  /**
   * 返回前一个元素.
   * @return 前一个元素 E
   */
  E previous();

  /**
   * 返回下一个元素.
   * @return 下一个元素 E
   */
  E next();
}
