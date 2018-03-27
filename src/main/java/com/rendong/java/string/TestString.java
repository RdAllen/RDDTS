/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * 文件名：	TestString
 * 模块说明：
 * 修改历史：
 * 2018-03-27 - RenDong- 创建。
 */
package com.rendong.java.string;

/**
 * Java——equals()方法和“==”运算符
 *
 *
 * 1. 首先String不属于8种基本数据类型，String是一个对象。
 *
 * 常量池(constantpool)指的是在编译期被确定， 并被保存在已编译的.class文件中的一些数据。
 * 它包括了关于类、方法、接口等中的常量，也包括字符串常量。
 *
 * String.intern()
 *
 * 再补充介绍一点：存在于.class文件中的常量池，在运行期被JVM装载，并且可以扩充。String的intern()方法就是扩充常量池的一个方法；
 * 当一个String实例str调用intern()方法时，Java查找常量池中是否有相同Unicode的字符串常量，如果有，则返回其的引用，如果没有，
 * 则在常量池中增加一个Unicode等于str的字符串并返回它的引用
 * 
 * @author RenDong
 */
public class TestString {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "abc";
    String s3 = new String("abc");

    System.out.println(s1 == s2); // true
    System.out.println(s1 == s3); // false

    System.out.println("================");

    String s4 = new String("kvill");
    String s5 = s4.intern();
    System.out.println(s4 == s4.intern());
    System.out.println(s4 + " " + s5);
    System.out.println(s4 == s5.intern());

  }
}
