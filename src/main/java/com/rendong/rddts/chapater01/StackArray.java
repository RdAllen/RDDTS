/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2017，所有权利保留。
 * 文件名：	StackArry
 * 模块说明：
 * 修改历史：
 * 2017-12-26 - RenDong- 创建。
 */
package com.rendong.rddts.chapater01;

/**
 * 借助数组实现的 栈
 *
 * @author RenDong
 */
public class StackArray implements Stack {
  public static final int CAPACITY = 1024;// 数组的默认容量
  protected int capacity; // 数组的实际容量
  protected Object[] S;// 对象数组
  protected int top = -1; // 栈顶元素的位置

  public StackArray() {
    capacity = CAPACITY;
    S = new Object[capacity];
  }

  public StackArray(int cap) {
    capacity = cap;
    S = new Object[capacity];
  }

  public int getSize() {
    return top + 1;
  }

  public boolean isEmpty() {
    return top < 0;
  }

  public Object top() throws ExceptionStackEmpty {
    if (isEmpty())
      throw new ExceptionStackEmpty("空栈");
    return S[top];
  }

  public void push(Object ele) {
    if (getSize() == capacity)
      throw new ExceptionStackFull("栈满了");
    S[++top] = ele;
  }

  public Object pop() throws ExceptionStackEmpty {
    Object ele;
    if (isEmpty())
      throw new ExceptionStackEmpty("空栈");
    ele = S[top];
    S[top--] = null;
    return ele;
  }
}
