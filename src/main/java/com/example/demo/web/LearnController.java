package com.example.demo.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LearnController {
    public static void main(String args[]) throws IOException {
        String site = "www.runoob.com";
        String site2 = "yijing";
        int len = site.length();
        site.concat(site2);
        System.out.println( "菜鸟教程网址长度 : " + len );
        StringBuffer sb = new StringBuffer("string buffer");
        StringBuilder sbuilder = new StringBuilder("string builder");

        int[] intArray;
        intArray = new int[10];
        intArray[0] = 10;
        for (int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }

        Arrays.sort(intArray);
        for (int a: intArray){
            System.out.println(a);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter char");
        char c;
        do {
           c = (char) br.read();
            System.out.printf("you enter: %c\n", c);
        }while (c != 'q');
//        String str;
//        do {
//            str = br.readLine();
//            System.out.printf("you enter %s\n", str);
//        }while (str != "end");

        Scanner scan = new Scanner(System.in);
        // 从键盘接收数据

        // next方式接收字符串
        System.out.println("next方式接收：");
        // 判断是否还有输入
        if (scan.hasNext()) {
            String str1 = scan.next();
            System.out.println("输入的数据为：" + str1);
        }
        scan.close();
    }
}