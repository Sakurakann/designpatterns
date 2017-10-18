package com.sakurakann.designpatterns.templatemethod;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.TemplateMethod.
 * User: Administrator.
 * Date: 2017-10-18 14:56.
 * Author: Haiyangp.
 */
public abstract class AbstractCalculator {

  /**
   * 计算.
   * 被子类重写
   * @param ints 运算因子
   * @return 运算结果
   */
  abstract int calculate(int... ints);

  /**
   * Calculate int.
   * 计算表达式结果和.
   * 主方法,实现对本类其他方法的调用.
   *
   * @param exp the exp 表达式
   * @param opt the opt 运算符
   * @return the int 结果和
   */
  public final int calculate(String exp,String opt) {
    int[] intArray = split(exp,opt);

    return calculate(intArray);
  }

  /**
   * Split int [ ].
   * 将运算表达式切分.
   *
   * @param exp the exp 运算表达式
   * @param opt the opt 操作符
   * @return the int [ ] 返回切分的运算因子
   */
  public int[] split(String exp,String opt) {
    String[] array = exp.split(opt);
    int length = array.length;
    int[] intArray = new int[length];
    for (int i = 0;i < length;i++) {
      intArray[i] = Integer.parseInt(array[i]);
    }

    return intArray;
  }

  /**
   * Template Method : 模板方法模式
   * 一个抽象类中,有一个主方法,再定义1...n个方法,可以是抽象的/具体实现的方法.
   * 继承该抽象类后重写抽象方法,创建实例时,使用多态,实现对子类的调用.
   *
   * 就是在AbstractCalculator类中定义一个主方法calculate()，calculate()调用spilt()等，
   * Plus和Minus分别继承AbstractCalculator类，通过对AbstractCalculator多态的调用实现对子类重写方法的调用.
   */

}
