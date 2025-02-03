package com.javarush.task.pro.task04.task0405;

/* 
Незаполненный прямоугольник
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 20) {
                if (i == 1 || i == 10 || j == 1 || j == 20) {
                    System.out.print("Б");
                }
                else
                    System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}