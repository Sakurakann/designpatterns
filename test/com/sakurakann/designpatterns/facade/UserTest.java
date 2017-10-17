package com.sakurakann.designpatterns.facade; 

import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * User Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/17/2017</pre> 
 * @version 1.0 
 */ 
public class UserTest { 

  Computer computer = null;
  User user = null;

  @Before
  public void before() throws Exception {
    computer = new Computer();
    user = new User(computer);
  } 

  @After
  public void after() throws Exception {
    user = null;
    computer = null;
  } 

 /** 
  * MethodName: useComputer(Computer computer) 
  */ 
  @Test
  public void testUseComputer() throws Exception { 
    user.userComputer();
  } 
  

} 
