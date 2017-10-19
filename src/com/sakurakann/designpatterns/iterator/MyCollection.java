package com.sakurakann.designpatterns.iterator;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.iterator.
 * User: Administrator.
 * Date: 2017-10-19 11:00.
 * Author: Haiyangp.
 */
public class MyCollection<E> implements Collection {

  String[] str = new String[]{"s","a","k","u","r","a","k","a","n","n"};

  @Override
  public Iterator iterator() {
    return new MyIterator(this);
  }

  @Override
  public int size() {
    return str.length;
  }

  @Override
  public Object get(int index) {
    if (index >= this.size() || index < 0) {
      throw new IndexOutOfBoundsException();
    }
    return str[index];
  }

  /**
   * 迭代器模式就是顺序访问聚集中的对象,一般来说在集合中非常常见.
   * 迭代器有两个组成部分,一是需要遍历的对象,即聚集对象,如集合;
   * 二是迭代器对象,持有聚集对象,用于对聚集对象进行遍历访问.如集合的迭代器.
   *
   * 经典实现为集合与其迭代器,如set+iterator;此处代码做模拟.
   */
}
