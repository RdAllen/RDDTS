/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * 文件名：	TestThread
 * 模块说明：
 * 修改历史：
 * 2018-04-01 - RenDong- 创建。
 */
package com.rendong.java.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author RenDong
 */
public class TestThread {

  public static void main() {
    ThreadPoolExecutor newFixedThreadPool = new ThreadPoolExecutor(
        Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), 0L,
        TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

  }
}
