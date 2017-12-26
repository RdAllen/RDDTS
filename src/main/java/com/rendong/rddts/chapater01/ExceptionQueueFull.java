/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2017，所有权利保留。
 * 文件名：	ExceptionStackFull
 * 模块说明：
 * 修改历史：
 * 2017-12-26 - RenDong- 创建。
 */
package com.rendong.rddts.chapater01;

/**
 * @author RenDong
 */
public class ExceptionQueueFull extends RuntimeException {
  public ExceptionQueueFull(String err) {
    super(err);
  }
}
