package com.zzu.java.basic;

import java.util.Scanner;

//        用*打印实心菱形
//1.计算空格
//2.输出*号
//3.换行
public class CreateRhombus {
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
//     键盘输入要打印的行数（输入值为奇数）
        System.out.println("请输入要打印菱形的行数");
        int row = keyInput.nextInt();
//        打印上半部分
        for (int i = 1; i <= (row + 1) / 2; i++) {
            for (int j = 1; j <= ((row + 1) / 2) - i; j++) {
                System.out.print("  ");
            }
            for (int m = 0; m < (2 * i - 1); m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//        打印下半部分
        for (int i = ((row + 1) / 2) + 1; i <= row; i++) {
            for (int j = i - ((row + 1) / 2); j >= 1; j--) {
                System.out.print("  ");
            }
            for (int m = 0; m < 2 * (row - i + 1) - 1; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
