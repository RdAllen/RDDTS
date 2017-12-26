/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2017，所有权利保留。
 * 文件名：	Queue
 * 模块说明：
 * 修改历史：
 * 2017-12-26 - RenDong- 创建。
 */
package com.rendong.rddts.chapater01;

/**
 * @author RenDong
 */
public interface Queue {

  public int getSize();

  public boolean isEmpty();

  public Object front() throws ExceptionQueueEmpty;

  public void enqueue(Object obj) throws ExceptionQueueFull;

  public Object dequeue() throws ExceptionQueueEmpty;

}
