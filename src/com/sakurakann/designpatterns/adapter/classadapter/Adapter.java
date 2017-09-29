package com.sakurakann.designpatterns.adapter.classadapter;

import com.sakurakann.designpatterns.adapter.SrcClass;
import com.sakurakann.designpatterns.adapter.Targetable;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.adapter.classadapter.
 * User: Administrator.
 * Date: 2017-09-29 15:32.
 * Author: Haiyangp.
 */
public class Adapter extends SrcClass implements Targetable {

  @Override
  public void methodExtend() {
    System.out.println("   targetable method");
  }
}
