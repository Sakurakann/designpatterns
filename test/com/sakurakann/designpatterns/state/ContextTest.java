package com.sakurakann.designpatterns.state; 

import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * Context Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/20/2017</pre> 
 * @version 1.0 
 */ 
public class ContextTest { 

  private State state = null;
  private Context context = null;

  @Before
  public void before() throws Exception {
    state = new State("1");
    context = new Context(state);
  } 

  @After
  public void after() throws Exception {
    state = null;
    context = null;
  }
  
 /** 
  * MethodName: doSt() 
  */ 
  @Test(timeout = 1000L)
  public void testDoSt() throws Exception {
    context.doSt();

    state.setStatement("2");
    context.doSt();

    state.setStatement("3");
    context.doSt();
  }
  

} 
