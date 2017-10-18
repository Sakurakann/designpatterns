package com.sakurakann.designpatterns.templatemethod;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.TemplateMethod.
 * User: Administrator.
 * Date: 2017-10-18 15:16.
 * Author: Haiyangp.
 */
public class Minus extends AbstractCalculator {

  @Override
  int calculate(int... ints) {
    int sum = ints[0];
    for (int i = 1;i < ints.length;i++) {
      sum -= ints[i];
    }
    return sum;
  }
}
