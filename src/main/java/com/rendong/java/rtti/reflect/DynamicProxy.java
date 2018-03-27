/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * 文件名：	DynamicProxy
 * 模块说明：
 * 修改历史：
 * 2018-03-20 - RenDong- 创建。
 */
package com.rendong.java.rtti.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author RenDong
 */

interface Subject {
  String say(String name, int age);
}

class RealSubject implements Subject {
  public String say(String name, int age) {
    return name + "  " + age;
  }
}

class MyInvocationHandler implements InvocationHandler {
  private Object obj = null;

  public Object bind(Object obj) {
    this.obj = obj;
    return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(),
        this);
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    return method.invoke(this.obj, args);
  }
}

public class DynamicProxy {
  public static void main(String[] args) {
    MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
    Subject sub = (Subject) myInvocationHandler.bind(new RealSubject());
    System.out.println(sub.say("rendong", 12));
  }
}
