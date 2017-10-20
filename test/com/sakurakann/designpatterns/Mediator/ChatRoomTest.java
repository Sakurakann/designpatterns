package com.sakurakann.designpatterns.Mediator; 

import org.junit.Assert.*;

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 

/** 
 * ChatRoom Tester. 
 * 
 * @author Haiyangp 
 * @since <pre>10/20/2017</pre> 
 * @version 1.0 
 */ 
public class ChatRoomTest { 

  @Before
  public void before() throws Exception { 
  } 

  @After
  public void after() throws Exception { 
  } 

 /** 
  * MethodName: showMessage(User user, String message) 
  */ 
  @Test(timeout = 1000L)
  public void testChat() throws Exception {
    ChatRoom chatRoom1 = new ChatRoom();
    ChatRoom chatRoom2 = new ChatRoom();

    User user1 = new User("Charles",chatRoom1);
    User user2 = new User("J",chatRoom1);
    User user3 = new User("Ezreal",chatRoom2);

    user1.sendMessage("HI everyone!");
    user2.sendMessage("HI , how are you?");
    user3.sendMessage("Can you hear me?");
  }
  

} 
