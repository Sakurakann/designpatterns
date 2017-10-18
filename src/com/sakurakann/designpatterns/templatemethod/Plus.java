package com.sakurakann.designpatterns.templatemethod;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.TemplateMethod.
 * User: Administrator.
 * Date: 2017-10-18 15:14.
 * Author: Haiyangp.
 */
public class Plus extends AbstractCalculator {


  @Override
  int calculate(int... ints) {
    int sum = 0;
    for (int anInt : ints) {
      sum += anInt;
    }

    return sum;
  }
}
