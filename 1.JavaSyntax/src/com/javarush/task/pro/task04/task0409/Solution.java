package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (scan.hasNextInt()) {
            int temp = scan.nextInt();
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println(min);
    }
}