/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * 文件名：	HiddenImpl
 * 模块说明：
 * 修改历史：
 * 2018-03-17 - RenDong- 创建。
 */
package com.rendong.java.typeinfo;

import com.rendong.java.typeinfo.interfacea.A;
import com.rendong.java.typeinfo.packageaccess.HiddenC;

import java.util.ArrayList;

/**
 * @author RenDong
 */
public class HiddenImpl {

  public static void main(String[] args) {
    A a = HiddenC.makeA();
    a.f();
    java.util.List list = new ArrayList();
    Object x = new Object();
    //父类不可以强制转换为子类 因为子类有的方法父类可能没有
    //System.out.println((String)x);
  }

}
