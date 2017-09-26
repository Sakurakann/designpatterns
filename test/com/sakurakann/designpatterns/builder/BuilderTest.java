package com.sakurakann.designpatterns.builder; 

import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * Builder Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>09/26/2017</pre> 
 * @version 1.0 
 */ 
public class BuilderTest {
  Builder builder = null;

  @Before
  public void before() throws Exception {
    builder = new Builder();
  } 

  @After
  public void after() throws Exception {
    builder = null;
  } 

 /** 
  * MethodName: produceMailSender(Integer count) 
  */ 
  @Test
  public void testProduceMailSender() throws Exception {
    Integer result = builder.produceMailSender(2);
    assert result.equals(2);
  } 
  
 /** 
  * MethodName: produceSmsSender(Integer count) 
  */ 
  @Test
  public void testProduceSmsSender() throws Exception { 
    Integer result = builder.produceSmsSender(2);
    assert result.equals(2);
  } 

} 
