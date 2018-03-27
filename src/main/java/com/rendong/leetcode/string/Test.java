/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2018，所有权利保留。
 * 文件名：	Test
 * 模块说明：
 * 修改历史：
 * 2018-01-10 - RenDong- 创建。
 */
package com.rendong.leetcode.string;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author RenDong
 */
public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ScheduledThreadPoolExecutor exec =new ScheduledThreadPoolExecutor(1);
        exec.scheduleAtFixedRate(new Runnable(){//每隔一段时间就触发异常
            public void run() {
                // TODO Auto-generated method stub
                //throw new RuntimeException();
                System.out.println("===================");

            }}, 1000, 5000, TimeUnit.MILLISECONDS);

        exec.scheduleAtFixedRate(new Runnable(){//每隔一段时间打印系统时间，证明两者是互不影响的

            public void run() {
                // TODO Auto-generated method stub
                System.out.println(System.nanoTime());

            }}, 1000, 2000, TimeUnit.MILLISECONDS);
    }
}
