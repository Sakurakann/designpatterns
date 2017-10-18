package com.sakurakann.designpatterns.observer; 

import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * MySubject Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/18/2017</pre> 
 * @version 1.0 
 */ 
public class MySubjectTest { 

  Observer observer1 = null;
  Observer observer2 = null;
  Subject subject = null;

  @Before
  public void before() throws Exception {
    observer1 = new Observer1();
    observer2 = new Observer2();
    subject = new MySubject();
  } 

  @After
  public void after() throws Exception {
    subject = null;
    observer2 = null;
    observer1 = null;
  } 

 /** 
  * MethodName: operation() 
  */ 
  @Test
  public void testOperation() throws Exception { 
    subject.add(observer1);
    subject.add(observer2);

    subject.operation();
    System.out.println();

    subject.delete(observer2);
    subject.operation();
  } 
  

} 
