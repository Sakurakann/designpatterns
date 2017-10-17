package com.sakurakann.designpatterns.facade;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.facade.
 * User: Administrator.
 * Date: 2017-10-17 10:13.
 * Author: Haiyangp.
 */
public class User {

  private Computer computer;

  public User() {
    super();
  }

  public User(Computer computer) {
    super();
    this.computer = computer;
  }

  public void useComputer(Computer computer) {
    computer.startup();
    computer.shutdown();
  }

  public void userComputer() {
    computer.startup();
    computer.shutdown();
  }
}
