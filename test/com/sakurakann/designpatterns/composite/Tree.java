package com.sakurakann.designpatterns.composite;

import java.util.Enumeration;

/**
 * Created with IntelliJ IDEA.
 * Project: designpatterns.
 * Package: com.sakurakann.designpatterns.composite.
 * User: Administrator.
 * Date: 2017-10-17 13:10.
 * Author: Haiyangp.
 */
public class Tree {
  TreeNode root = null;

  public Tree(String name) {
    super();
    root = new TreeNode(name);
    root.setParent(null);
  }

  public Tree() {
    super();
  }

  public TreeNode getRoot() {
    return root;
  }

  public static void main(String[] args) {
    Tree treeA = new Tree("Root A");
    TreeNode nodeB = new TreeNode("Node B");
    TreeNode nodeC = new TreeNode("Node C");
    TreeNode nodeD = new TreeNode("Node D");

    nodeC.add(nodeD);
    nodeB.add(nodeC);
    treeA.root.add(nodeB);

    System.out.println(treeA.root.getName());
    System.out.println(treeA.root.getParent());
    treeA.printAllChildren(treeA.getRoot());
  }

  int anInt = 0;
  public void printAllChildren(TreeNode node) {
    Enumeration<TreeNode> children = node.getChildren();
    String message = " 没有父节点!";
    if (children != null || node.childrenCount() > 0) {
      while (children.hasMoreElements()) {
        TreeNode childrenNode = children.nextElement();
        TreeNode parent = childrenNode.getParent();
        if (parent != null||!parent.equals(null)) {
          message = " has a parent" +parent.getName();
        }

        for (int i = 0;i < anInt;i++){
          System.out.print("  ");
        }
        System.out.println(childrenNode.getName() + message);
        anInt++;
        printAllChildren(childrenNode);
      }
    }
  }
}
