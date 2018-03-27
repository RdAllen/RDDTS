/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * 文件名：	HiddenC
 * 模块说明：
 * 修改历史：
 * 2018-03-17 - RenDong- 创建。
 */
package com.rendong.java.typeinfo.packageaccess;

import com.rendong.java.typeinfo.interfacea.A;

/**
 * @author RenDong
 */

class C implements A {
  public void f() {
    System.out.println("public c.f()");
  }

  public void g() {
    System.out.println("public c.g()");
  }

  void u() {
    System.out.println("packge C.u()");
  }

  protected void v() {
    System.out.println("protected C.v()");
  }

  private void w() {
    System.out.println("private C.w()");
  }
}

public class HiddenC {
  public static A makeA() {
    return new C();
  }
}
