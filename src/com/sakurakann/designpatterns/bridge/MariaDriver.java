package com.sakurakann.designpatterns.bridge;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.bridge.
 * User: Administrator.
 * Date: 2017-10-17 11:03.
 * Author: Haiyangp.
 */
public class MariaDriver implements Driver {

  @Override
  public void getConn() {
    System.out.println("Get MariaDB-Connection!");
  }
}
