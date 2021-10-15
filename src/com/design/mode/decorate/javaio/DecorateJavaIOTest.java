package com.design.mode.decorate.javaio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 刘少武
 * @version 0.0.1
 * @createTime 2021/10/11 15:58
 * @description 测试
 */
public class DecorateJavaIOTest {
    public static void main(String[] args) {
        int c;
        try {
            LowerCaseInputStream is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("D:\\WorkSpace\\self\\head-first-design-mode\\out\\production\\head-first-design-mode\\decorate\\test.txt")));
            while ((c = is.read()) >= 0) {
                System.out.print((char) c);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
