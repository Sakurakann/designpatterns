package com.sakurakann.designpatterns.iterator; 

import com.sun.org.apache.xpath.internal.SourceTree;
import org.junit.AfterClass;
import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * MyIterator Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/19/2017</pre> 
 * @version 1.0 
 */ 
public class MyIteratorTest {
  Collection collection = null;
  Iterator iterator = null;

  @Before
  public void before() throws Exception {
    collection = new MyCollection();
    iterator = collection.iterator();
  } 

  @After
  public void after() throws Exception {
    iterator = null;
    collection = null;
  } 

 /** 
  * MethodName: hasNext() 
  */ 
  @Test
  public void testHasNext() throws Exception {
    System.out.println(iterator.hasNext());
  } 
  
 /** 
  * MethodName: first() 
  */ 
  @Test
  public void testFirst() throws Exception {
    System.out.println(iterator.first());
  }
  
 /** 
  * MethodName: previous() 
  */ 
  @Test
  public void testPrevious() throws Exception {
    iterator.next();
    iterator.next();
    System.out.println(iterator.previous());
  } 
  
 /** 
  * MethodName: next() 
  */ 
  @Test
  public void testNext() throws Exception { 
    while (iterator.hasNext()) {
      String str = (String) iterator.next();
      System.out.print(str);
    }
    System.out.println();
  } 
  

} 
