package com.sakurakann.designpatterns.bridge; 

import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * DriverBridge Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/17/2017</pre> 
 * @version 1.0 
 */ 
public class DriverBridgeTest { 

  private DriverBridge bridge = null;
  private OracleDriver oracle = null;
  private MariaDriver maria = null;

  @Before
  public void before() throws Exception {
    oracle = new OracleDriver();
    maria = new MariaDriver();
    bridge = new DriverBridge();
  }

  @After
  public void after() throws Exception {
    bridge = null;
    maria = null;
    oracle = null;
  } 


 /** 
  * MethodName: getConn() 
  */ 
  @Test
  public void testGetConn() throws Exception {
    bridge.setDriver(oracle);
    bridge.getConn();

    bridge.setDriver(maria);
    bridge.getConn();
  } 
  

} 
