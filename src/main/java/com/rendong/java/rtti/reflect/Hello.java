/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * 文件名：	Hello
 * 模块说明：
 * 修改历史：
 * 2018-03-20 - RenDong- 创建。
 */
package com.rendong.java.rtti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author RenDong
 */

class Demo {
}

interface China {
  public static final String name = "Rollen";
  public static int age = 20;

  public void sayChina();

  public void sayHello(String name, int age);
}

abstract class Run {

  public String time;

  private int speed;

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public void Run() {
    System.out.println("RUN------");
  }
}

class Person extends Run implements China {

  /*
   * 如果不定义 无参构造函数 newInstance 会报错
   */
  public Person() {
  }

  public Person(String name) {
    this.name = name;
  }

  public Person(int age) {
    this.age = age;
  }

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String toString() {
    return this.age + " " + this.name;
  }

  public void sayChina() {
    System.out.println("hello ,china");
  }

  public void sayHello(String name, int age) {
    System.out.println(name + "  " + age);
  }
}

public class Hello {
  public static void main(String[] args) {
    Class<?> clazz = null;

    try {

      //clazz = Class.forName("com.rendong.java.rtti.reflect.Person");
      clazz = Person.class;// 两种写法等价

      Person per1 = null;
      Person per2 = null;
      Person per3 = null;
      Person per4 = null;
      per1 = (Person) clazz.newInstance();
      per1.setAge(10);
      per1.setName("rendong");
      System.out.println(per1);

      // contronstucts
      Constructor<?>[] cons = clazz.getConstructors();

      /*
       * per1 = (Person) cons[0].newInstance(); per2 = (Person)
       * cons[1].newInstance("per2"); per3 = (Person) cons[2].newInstance(3);
       * per4 = (Person) cons[3].newInstance("per4", 4);
       */

      /*
       * System.out.println(per1); System.out.println(per2);
       * System.out.println(per3); System.out.println(per4);
       */

      Method methodSayChina = clazz.getMethod("sayChina");

      Method methodSayHello = clazz.getMethod("sayHello", String.class, int.class);
      methodSayHello.invoke(clazz.newInstance(), "Raool", 12);

      for (Field field : clazz.getDeclaredFields()) {
        System.out.println("decalareField:" + field.getName() + " " + field.getType() + " "
            + field.getModifiers());

      }

      for (Field field : clazz.getFields()) {
        System.out.println(
            "field:" + field.getName() + " " + field.getType() + " " + field.getModifiers());
        char[] fieldName = field.getName().toCharArray();
        fieldName[0] -= 32;

        Method getMethod = clazz.getMethod("get" + String.valueOf(fieldName));
        getMethod.invoke(clazz.newInstance());
      }
      Field nameField = clazz.getDeclaredField("name");
      System.out.println(nameField.get(nameField));

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
