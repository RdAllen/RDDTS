/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * 文件名：	TestHashMap
 * 模块说明：
 * 修改历史：
 * 2018-03-08 - RenDong- 创建。
 */
package com.rendong.java.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author RenDong
 */
public class TestHashMap {

  public static void main(String[] args) {


    int a = 9;
    // 1111 1111 1111 1111 1111 1111 1111 1011
    // System.out.println(-5 >> 2);
    System.out.println(reverse(123));
    TestHashMap test = new TestHashMap();
    test.testHash();
  }

  public void testHash() {
    Map map = new HashMap();
    Person asiaKey = new Person("UU01", "XIAOMEI");
    Person asiaVal = new Person("UU02", "XIAOMEI");

    Person japanKey = new Person("UU01", "XIAOMEI");
    Person japanVal = new Person("UU02", "XIAOMEI");
    map.put(asiaKey, asiaVal);
    map.put(japanKey, japanVal);
  }

  class Person {

    Person(String uuid, String name) {
      this.uuid = uuid;
      this.name = name;
    }

    private String uuid;

    public String getUuid() {
      return uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }

    private String age;
    private String name;
    private String sex;

    public String getAge() {
      return age;
    }

    public void setAge(String age) {
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getSex() {
      return sex;
    }

    public void setSex(String sex) {
      this.sex = sex;
    }

    public int hashCode() {
      return this.uuid.hashCode();
    }

    public boolean equals(Object obj) {
      if (obj instanceof Person) {
        return (this.uuid == ((Person) obj).uuid);
      }
      return false;
    }

  }

  public static int reverse(int x) {
    int result = 0;
    while (x != 0) {
      result = result * 10 + (x % 10);
      x = x / 10;
    }
    return result;
  }
}
