/**
 * 版权所有(C)，上海海鼎信息工程股份有限公司，2017，所有权利保留。
 * 文件名：	Test01
 * 模块说明：
 * 修改历史：
 * 2017-12-29 - RenDong- 创建。
 */
package com.rendong.rddts.chapater01;

import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.util.Arrays;
import java.util.zip.Deflater;

/**
 * @author RenDong
 */
public class Test01 {
    public static byte[] compress(String str) throws IOException {
        byte[] input = str.getBytes("UTF-8");

        byte[] output = new byte[100];
        Deflater compresser = new Deflater();
        compresser.setInput(input);
        compresser.finish();
        int len = compresser.deflate(output);
        compresser.end();
        return Arrays.copyOfRange(output, 0, len);
    }

    public static void main(String[] args) throws IOException {

        System.out.println("BalsamIQ Mockups keygen - AMPED");
        String name = "rendong1991";
        String users = "1000";
        int product = 4;

        String[] products = {
            "MockupsConfluence", "MockupsJIRA", "MockupsXWiki", "MockupsAir", "MockupsFogBugz",
            "MockupsCompanion" };
        String encodethis = products[product] + "|" + name + "|" + "2209032000" + "|" + "C" + users;
        BASE64Encoder b64encode = new BASE64Encoder();
        encodethis = b64encode.encode(compress(encodethis));
        System.out.println(encodethis);
    }
}
