package com.sakurakann.designpatterns.decorator; 

import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * Decorator Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/16/2017</pre> 
 * @version 1.0 
 */ 
public class DecoratorTest { 

  Sourceable source = null;
  Sourceable decorator = null;

  @Before
  public void before() throws Exception {
    source = new Source();
    decorator = new Decorator(source);
  } 

  @After
  public void after() throws Exception {
    source = null;
    decorator = null;
  } 

 /** 
  * MethodName: someMethod() 
  */ 
  @Test
  public void testSomeMethod() throws Exception {
    decorator.someMethod();
  }
  

} 
