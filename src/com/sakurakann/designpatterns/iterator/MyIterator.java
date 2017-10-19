package com.sakurakann.designpatterns.iterator;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.iterator.
 * User: Administrator.
 * Date: 2017-10-19 11:01.
 * Author: Haiyangp.
 */
public class MyIterator<E> implements Iterator {

  private Collection<E> collection;

  private int pos = -1;

  public MyIterator(Collection<E> collection) {
    this.collection = collection;
  }

  /**
   * 是否有下一个元素.
   *
   * @return true Y/false N
   */
  @Override
  public boolean hasNext() {
    return pos < collection.size() - 1;
  }

  /**
   * 返回第一个元素.
   *
   * @return 第一个元素 E
   */
  @Override
  public Object first() {
    if (pos < collection.size() - 1) {
      return collection.get(0);
    }
    throw new IndexOutOfBoundsException();
  }

  /**
   * 返回前一个元素.
   *
   * @return 前一个元素 E
   */
  @Override
  public Object previous() {
    if (pos > 0) {
      pos--;
      return collection.get(pos);
    }
    throw new IndexOutOfBoundsException();
  }

  /**
   * 返回下一个元素.
   *
   * @return 下一个元素 E
   */
  @Override
  public Object next() {
    if (pos < collection.size() - 1) {
      pos++;
      return collection.get(pos);
    }
    throw new IndexOutOfBoundsException();
  }

  /**
   * 迭代器模式就是顺序访问聚集中的对象,一般来说在集合中非常常见.
   * 迭代器有两个组成部分,一是需要遍历的对象,即聚集对象,如集合;
   * 二是迭代器对象,持有聚集对象,用于对聚集对象进行遍历访问.如集合的迭代器.
   *
   * 经典实现为集合与其迭代器,如set+iterator;此处代码做模拟.
   */
}
