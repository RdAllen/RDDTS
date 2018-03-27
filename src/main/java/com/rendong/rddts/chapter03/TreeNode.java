/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * 文件名：	TreeNode
 * 模块说明：
 * 修改历史：
 * 2018-01-10 - RenDong- 创建。
 */
package com.rendong.rddts.chapter03;

/**
 * @author RenDong
 */
public class TreeNode {
  private int key = 0;
  private boolean isVisited = false;
  private String data;
  private TreeNode leftChild;
  private TreeNode rightChild;

  public TreeNode() {
  }

  public TreeNode(int key, String data) {
    this.key = key;
    this.data = data;
    this.leftChild = null;
    this.rightChild = null;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public boolean isVisited() {
    return isVisited;
  }

  public void setVisited(boolean visited) {
    isVisited = visited;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public TreeNode getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(TreeNode leftChild) {
    this.leftChild = leftChild;
  }

  public TreeNode getRightChild() {
    return rightChild;
  }

  public void setRightChild(TreeNode rightChild) {
    this.rightChild = rightChild;
  }
}
