package com.sakurakann.designpatterns.templatemethod;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.TemplateMethod.
 * User: Administrator.
 * Date: 2017-10-18 15:19.
 * Author: Haiyangp.
 */
public class UseCalc {

  /**
   * The entry point of application.
   *
   * @param args the input arguments
   */
  public static void main(String[] args) {

    String plusExp = "8+2";
    AbstractCalculator calc = new Plus();
    int result = calc.calculate(plusExp, "\\+");
    System.out.println(result);

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
