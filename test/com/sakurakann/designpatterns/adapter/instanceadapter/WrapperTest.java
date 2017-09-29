package com.sakurakann.designpatterns.adapter.instanceadapter;

import com.sakurakann.designpatterns.adapter.SrcClass;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/** 
 * Wrapper Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>09/29/2017</pre> 
 * @version 1.0 
 */ 
public class WrapperTest {

  private static Wrapper wrapper = null;

  @BeforeClass
  public static void before() throws Exception {
    wrapper = new Wrapper(new SrcClass());
  } 

  @AfterClass
  public static void after() throws Exception {
    wrapper = null;
  } 

 /** 
  * MethodName: method() 
  */ 
  @Test
  public void testMethod() throws Exception { 
    wrapper.method();
  } 
  
 /** 
  * MethodName: methodExtend() 
  */ 
  @Test
  public void testMethodExtend() throws Exception { 
    wrapper.methodExtend();
  }

} 
