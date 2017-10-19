package com.sakurakann.designpatterns.iterator;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.iterator.
 * User: Administrator.
 * Date: 2017-10-19 10:52.
 * Author: Haiyangp.
 */
public interface Collection<E> {

  /**
   * 获取迭代器.
   * @return 迭代器
   */
  Iterator<E> iterator();

  /**
   * 获取集合容量.
   * @return The size of collection
   */
  int size();

  /**
   * 根据索引获取该位置上的值.
   * @param index 位置索引
   * @return 索引位置的值
   */
  E get(int index);

}
