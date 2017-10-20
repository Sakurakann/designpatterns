package com.sakurakann.designpatterns.Mediator;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.Mediator.
 * User: Administrator.
 * Date: 2017-10-20 15:21.
 * Author: Haiyangp.
 */
public class User {

  /**
   * Instantiates a new User.
   *
   * @param name the name
   * @param chatRome the chat rome
   */
  public User(String name, ChatRoom chatRome) {
    super();
    this.name = name;
    this.chatRome = chatRome;
  }

  /**
   * Instantiates a new User.
   */
  public User() {
    super();
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets chat rome.
   *
   * @return the chat rome
   */
  public ChatRoom getChatRome() {
    return chatRome;
  }

  /**
   * Sets chat rome.
   *
   * @param chatRome the chat rome
   */
  public void setChatRome(ChatRoom chatRome) {
    this.chatRome = chatRome;
  }

  private String name = null;

  private ChatRoom chatRome = null;

  /**
   * Send message.
   *
   * @param message the message
   */
  public void sendMessage(String message) {
    chatRome.showMessage(this,message);
  }

}
