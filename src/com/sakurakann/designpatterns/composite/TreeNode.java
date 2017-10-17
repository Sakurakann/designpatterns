package com.sakurakann.designpatterns.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.composite.
 * User: Administrator.
 * Date: 2017-10-17 13:00.
 * Author: Haiyangp.
 */
public class TreeNode {

  /**
   * 节点名称.
   */
  private String name;

  /**
   * 父节点.
   */
  private TreeNode parent;

  /**
   * 子节点.
   */
  private Vector<TreeNode> children = new Vector<TreeNode>();

  public TreeNode(String name) {
    super();
    this.name = name;
  }

  public TreeNode() {
    super();
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setParent(TreeNode parent) {
    this.parent = parent;
  }

  public TreeNode getParent() {
    return parent;
  }

  /**
   * 添加子节点.
   * @param node 节点
   */
  public void add(TreeNode node) {
    node.setParent(this);
    children.add(node);
  }

  /**
   * 删除指定的子节点.
   * @param node 要删除的子节点.
   */
  public void remove(TreeNode node) {
    children.remove(node);
  }

  /**
   * 获取全部子节点.
   * @return 所有子节点.
   */
  public Enumeration<TreeNode> getChildren() {
    return children.elements();
  }

  public int childrenCount() {
    return children.size();
  }

  /**
   * 使用场景:将多个对象组合在一起进行操作,常用于表示树形结构中以及链表结构中.
   * 组合模式又叫部分-整体模式,在处理类似树形结构的问题时比较方便.
   */
}
