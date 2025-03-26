package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);

        double radius = console.nextDouble();
        System.out.println((int)(3.14 * radius * radius));
    }
}