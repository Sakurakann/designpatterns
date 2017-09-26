package com.sakurakann.designpatterns.prototype; 

import com.sakurakann.designpatterns.prototype.Prototype1.SerializableObject;
import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * Prototype1 Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>09/26/2017</pre> 
 * @version 1.0 
 */ 
public class Prototype1Test {

  Prototype1 prototype = null;

  @Before
  public void before() throws Exception {
   prototype = new Prototype1();
   prototype.setNum(1);
   prototype.setStr("saknn");
   /*
   内部类创建实例.
    */
   prototype.setObj(prototype.new SerializableObject("sakura"));
  } 

  @After
  public void after() throws Exception {
   prototype = null;
  } 

 /** 
  * MethodName: clone() 
  */ 
  @Test
  public void testClone() throws Exception { 
    Object obj = prototype.clone();
    verify(obj);
  } 
  
 /** 
  * MethodName: deepClone() 
  */ 
  @Test
  public void testDeepClone() throws Exception {
   Object obj = prototype.deepClone();
   verify(obj);
  } 

  private void verify(Object obj){
    assert obj != null;
    assert obj instanceof Prototype1;

    System.out.println(((Prototype1) obj).getNum());
    System.out.println(((Prototype1) obj).getStr());
    System.out.println(((Prototype1) obj).getObj().getString());
  }

} 
