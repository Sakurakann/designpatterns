package com.sakurakann.designpatterns.proxy; 

import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * Proxy Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/17/2017</pre> 
 * @version 1.0 
 */ 
public class ProxyTest { 

  @Before
  public void before() throws Exception { 
  } 

  @After
  public void after() throws Exception { 
  } 

 /** 
  * MethodName: method() 
  */ 
  @Test
  public void testMethod() throws Exception {
    Proxy proxy = new Proxy();
    proxy.method();
  }

} 
