package com.sakurakann.designpatterns.adapter.classadapter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/** 
 * Adapter Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>09/29/2017</pre> 
 * @version 1.0 
 */ 
public class AdapterTest {
  private Adapter adapter = null;

  @Before
  public void before() throws Exception {
    adapter = new Adapter();
  } 

  @After
  public void after() throws Exception {
    adapter = null;
  } 

 /** 
  * MethodName: methodExtend() 
  */ 
  @Test
  public void testMethodExtend() throws Exception {
    adapter.method();
    adapter.methodExtend();
  } 
  

} 
