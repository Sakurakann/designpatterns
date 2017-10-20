package com.sakurakann.designpatterns.state;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.state.
 * User: Administrator.
 * Date: 2017-10-20 12:57.
 * Author: Haiyangp.
 */
public class State {

  /**
   * 状态.
   */
  private String statement = null;

  /**
   * Instantiates a new State.
   *
   * @param statement the statement
   */
  public State(String statement) {
    super();
    this.statement = statement;
  }

  /**
   * Instantiates a new State.
   */
  public State() {
    super();
  }

  /**
   * Gets statement.
   *
   * @return the statement
   */
  public String getStatement() {
    return statement;
  }

  /**
   * Sets statement.
   *
   * @param statement the statement
   */
  public void setStatement(String statement) {
    this.statement = statement;
  }

  /**
   * Do st 1.
   */
  public void doSt1() {
    System.out.println("statement 1 do something 1");
  }

  /**
   * Do st 2.
   */
  public void doSt2() {
    System.out.println("statement 2 do something 2");
  }
}
