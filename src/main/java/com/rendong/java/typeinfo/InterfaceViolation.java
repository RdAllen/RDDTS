/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * 文件名：	InterfaceViolation
 * 模块说明：
 * 修改历史：
 * 2018-03-17 - RenDong- 创建。
 */
package com.rendong.java.typeinfo;

import com.rendong.java.typeinfo.interfacea.A;

/**
 * @author RenDong
 */
public class InterfaceViolation {
  public static void main(String[] args) {
    A a = new B();
    a.f();
    // a.g();
    System.out.println(a.getClass().getName());
    if (a instanceof B) {
      B b = (B) a;
      b.g();
    }
  }
}

class B implements A {
  public void f() {

  }

  public void g() {
  }
}