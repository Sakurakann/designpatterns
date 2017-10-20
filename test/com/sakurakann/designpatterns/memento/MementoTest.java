package com.sakurakann.designpatterns.memento; 

import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * Memento Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/20/2017</pre> 
 * @version 1.0 
 */ 
public class MementoTest {
  private Original original = null;
  private Storage storage = null;

  @Before
  public void before() throws Exception {
    original = new Original("sakura");
    storage = new Storage(original.createMemento());
  }

  @After
  public void after() throws Exception {
    original = null;
    storage = null;
  } 

  @Test(timeout = 2000L)
  public void testMemento() throws Exception {

    System.out.println("original value -->" + original.getValue());

    String editValue = "sakurakann";
    original.setValue(editValue);
    System.out.println("edit original.value to --->" + editValue);

    System.out.println("original value -->" + original.getValue());

    String reValue = storage.getMemento().getValue();
    original.setValue(reValue);
    System.out.println("recover value --->" + reValue);

    System.out.println("original value now -->" + original.getValue());
  }

}
