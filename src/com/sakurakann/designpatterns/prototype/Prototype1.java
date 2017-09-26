package com.sakurakann.designpatterns.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.prototype.
 * User: Administrator.
 * Date: 2017-09-26 15:05.
 * Author: Haiyangp.
 */
public class Prototype1 implements Cloneable, Serializable {

  private static final long serialVersionUID = 4525470518356407073L;

  private String str;
  private int num;
  private SerializableObject obj;

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public SerializableObject getObj() {
    return obj;
  }

  public void setObj(SerializableObject obj) {
    this.obj = obj;
  }


  /**
   * 浅复制.
   * @return clone instance
   * @throws CloneNotSupportedException 不支持克隆.
   */
  @Override
  public Object clone() throws CloneNotSupportedException {
    Prototype1 prototype = (Prototype1) super.clone();
    return prototype;
  }

  /**
   * Deep clone object.
   *
   * @return the object
   * @throws IOException the io exception
   * @throws ClassNotFoundException the class not found exception
   */
  public Object deepClone() throws IOException, ClassNotFoundException {

    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
    objectOutputStream.writeObject(this);

    ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
    ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
    return objectInputStream.readObject();
  }

  /**
   * 引用变量.
   */
  class SerializableObject implements Serializable {
    private static final long serialVersionUID = 2481973058988792896L;

    private String string;

    public String getString() {
      return string;
    }

    public void setString(String string) {
      this.string = string;
    }

    public SerializableObject() {
      super();
    }

    public SerializableObject(String str) {
      this.string = str;
    }
  }

  /**
   * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
   * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。
   * 简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
   * <br/>
   * Shallow replication: after copying an object, the variables of the base data type are
   * recreated, and the reference type points to the same object as the original object.
   * Deep copy: after copying an object, both the basic data type and the reference type are
   * recreated. In simple terms, it is the deep copy that is completely copied,
   * and the shallow replication is incomplete.
   */
}
