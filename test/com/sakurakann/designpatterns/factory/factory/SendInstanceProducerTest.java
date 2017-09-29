package com.sakurakann.designpatterns.factory.factory;

import com.sakurakann.designpatterns.factory.bean.Sender;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * SendInstanceProducer Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>09/22/2017</pre> 
 * @version 1.0 
 */ 
public class SendInstanceProducerTest { 

  @Before
  public void before() throws Exception { 
  } 

  @After
  public void after() throws Exception { 
  } 

 /** 
  * MethodName: produce(String type) 
  */ 
  @Test
  public void testProduce() throws Exception {
    SendInstanceProducer producer = new SendInstanceProducer();
    Sender sender = producer.produce("mail");
    assert sender != null;
    sender.send();
  } 
  

} 
