package com.sakurakann.designpatterns.command;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.command.
 * User: Administrator.
 * Date: 2017-10-19 15:51.
 * Author: Haiyangp.
 */
public class MyCommand implements Command {

  private Receiver receiver;

  public MyCommand() {
    super();
  }

  public MyCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  @Override
  public void exec() {
    receiver.action();
  }
}
