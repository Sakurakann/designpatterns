package com.sakurakann.designpatterns.adapter.interfaceadapter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
 * WAdapter0 Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>09/29/2017</pre> 
 * @version 1.0 
 */ 
public class WAdapter0Test {
  private WAdapter0 wAdapter0 = null;

  @Before
  public void before() throws Exception {
    wAdapter0 = new WAdapter0();
  } 

  @After
  public void after() throws Exception {
    wAdapter0 = null;
  } 

 /** 
  * MethodName: method() 
  */ 
  @Test
  public void testMethod() throws Exception { 
    wAdapter0.method();
    wAdapter0.methodExtend();
  }

} 
