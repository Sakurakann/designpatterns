package com.sakurakann.designpatterns.strategy;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.strategy.
 * User: Administrator.
 * Date: 2017-10-18 10:45.
 * Author: Haiyangp.
 */
public class Plus extends AbstractCalculator implements Icalculator {

  @Override
  public int calculare(String exp) {
    int[] intArray = split(exp,"\\+");
    int sum = 0;
    for (int i : intArray) {
      sum += i;
    }
    return sum;
  }

  /**
   * 策略模式定义了一系列算法,并将每个算法都封装起来,使他们可以相互替换,且算法的变化不会影响到使用算法的客户.
   * 需要设计一个接口,为一系列实现类提供统一的方法,多个实现类实现该接口,设计一个抽象类作为辅助类(可有可无).
   * 辅助类提供通用辅助函数.
   *
   * 策略模式的决定权在于用户,系统本身提供不同的算法实现,新增或者删除算法,对各种算法做封装.
   * 因此,策略模式多用在算法决策系统中,外部用户只需要决定用哪个算法即可.
   */
}
