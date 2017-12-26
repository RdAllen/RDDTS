/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2017，所有权利保留。
 * 文件名：	StackTest
 * 模块说明：
 * 修改历史：
 * 2017-12-26 - RenDong- 创建。
 */
package com.rendong.rddts.chapater01;

/**
 * @author RenDong
 */
public interface Stack {

  /**
   * 返回栈中的元素数目
   * 
   * @return
   */
  public int getSize();

  /**
   * 判断栈是否为空
   * 
   * @return
   */
  public boolean isEmpty();

  /**
   * 取出栈顶元素
   * 
   * @return
   * @throws ExceptionStackEmpty
   */
  public Object top() throws ExceptionStackEmpty;

  /**
   * 入栈
   * 
   * @param ele
   */
  public void push(Object ele);

  /**
   * 出栈
   * 
   * @return
   * @throws ExceptionStackEmpty
   */
  public Object pop() throws ExceptionStackEmpty;

}
