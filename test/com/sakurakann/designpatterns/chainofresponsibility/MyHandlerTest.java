package com.sakurakann.designpatterns.chainofresponsibility; 

import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * MyHandler Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/19/2017</pre> 
 * @version 1.0 
 */ 
public class MyHandlerTest {
  private MyHandler handler0 = null;
  private MyHandler handler1 = null;
  private MyHandler handler2 = null;

  @Before
  public void before() throws Exception {
    handler0 = new MyHandler("handler0");
    handler1 = new MyHandler("handler1");
    handler2 = new MyHandler("handler2");

    handler0.setHandler(handler1);
    handler1.setHandler(handler2);
  } 

  @After
  public void after() throws Exception {
    handler0 = null;
    handler1 = null;
    handler2 = null;
  } 

 /** 
  * MethodName: operator() 
  */ 
  @Test(timeout = 1000)
  public void testOperator() throws Exception {
    handler0.operator();
  }

}
