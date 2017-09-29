package com.sakurakann.designpatterns.factory.factory;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
 * MultipleInstanceProducer Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>09/22/2017</pre> 
 * @version 1.0 
 */ 
public class MultipleInstanceProducerTest {
  MultipleInstanceProducer producer;

  @Before
  public void before() throws Exception {
    producer = new MultipleInstanceProducer();
  } 

  @After
  public void after() throws Exception {
    producer = null;
    System.gc();
  } 

 /** 
  * MethodName: mailSenderProduce() 
  */ 
  @Test
  public void testMailSenderProduce() throws Exception {
    producer.mailSenderProduce().send();
  } 
  
 /** 
  * MethodName: smsSenderProduce() 
  */ 
  @Test
  public void testSmsSenderProduce() throws Exception { 
    producer.smsSenderProduce().send();
  }
  

} 
