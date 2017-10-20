package com.sakurakann.designpatterns.state;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.state.
 * User: Administrator.
 * Date: 2017-10-20 12:59.
 * Author: Haiyangp.
 */
public class Context {

  /**
   * 状态实例.
   */
  private State state = null;

  /**
   * Instantiates a new Context.
   *
   * @param state the state
   */
  public Context(State state) {
    super();
    this.state = state;
  }

  /**
   * Instantiates a new Context.
   */
  public Context() {
    super();
  }

  /**
   * Gets state.
   *
   * @return the state
   */
  public State getState() {
    return state;
  }

  /**
   * Sets state.
   *
   * @param state the state
   */
  public void setState(State state) {
    this.state = state;
  }

  /**
   * Do st.
   */
  public void doSt() {
    if ("1".equalsIgnoreCase(state.getStatement())) {
      state.doSt1();
    } else if ("2".equalsIgnoreCase(state.getStatement())) {
      state.doSt2();
    } else {
      System.out.println("do nothing ~");
    }
  }

  /**
   * state pattern:状态模式
   * 可以通过改变状态来获得不同的行为处理方式.
   * 在日常开发中比较常用,根据对象的某一个属性,区别开它们的一些行为功能,如简单的权限控制等.
   * State类:状态类.Context类:状态切换类;C根据判断S中statement的属性值来决策要执行的行为方法.
   *
   * @see ContextTest
   */
}
