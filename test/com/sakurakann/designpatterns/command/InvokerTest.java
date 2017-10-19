package com.sakurakann.designpatterns.command; 

import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * Invoker Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/19/2017</pre> 
 * @version 1.0 
 */ 
public class InvokerTest {
  private Command command = null;
  private Receiver receiver = null;
  private Invoker invoker = null;

  @Before
  public void before() throws Exception {
    receiver = new Receiver();
    command = new MyCommand(receiver);
    invoker = new Invoker(command);
  } 

  @After
  public void after() throws Exception { 
  } 

 /** 
  * MethodName: action() 
  */ 
  @Test(timeout = 2000L)
  public void testAction() throws Exception { 
    invoker.action();
  }

} 
