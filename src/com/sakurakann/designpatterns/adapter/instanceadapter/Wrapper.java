package com.sakurakann.designpatterns.adapter.instanceadapter;

import com.sakurakann.designpatterns.adapter.SrcClass;
import com.sakurakann.designpatterns.adapter.Targetable;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.adapter.instanceadapter.
 * User: Administrator.
 * Date: 2017-09-29 15:41.
 * Author: Haiyangp.
 */
public class Wrapper implements Targetable {

  private SrcClass srcClass = null;
  public Wrapper() {
    super();
  }

  public Wrapper(SrcClass srcClass) {
    super();
    this.srcClass = srcClass;
  }

  @Override
  public void method() {
    srcClass.method();
  }

  @Override
  public void methodExtend() {
    System.out.println("   wrapper targetable method");
  }
}
