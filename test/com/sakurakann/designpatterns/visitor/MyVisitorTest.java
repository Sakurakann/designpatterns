package com.sakurakann.designpatterns.visitor; 

import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * MyVisitor Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/20/2017</pre> 
 * @version 1.0 
 */ 
public class MyVisitorTest {
  private Subject subject = null;
  private Visitor visitor = null;

  @Before
  public void before() throws Exception {
    subject = new MySubject("sakurakann");
    visitor = new MyVisitor();
  } 

  @After
  public void after() throws Exception { 
  } 

 /** 
  * MethodName: visit(Subject subject) 
  */ 
  @Test(timeout = 1000L)
  public void testVisit() throws Exception {
    subject.accept(visitor);
  } 
  

} 
