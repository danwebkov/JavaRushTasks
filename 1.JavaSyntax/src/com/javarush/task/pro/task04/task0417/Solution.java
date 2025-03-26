package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner console = new Scanner(System.in);

        int meterPerSecond = console.nextInt();
        int kmPerHour = (int) Math.round(meterPerSecond * 3.6);

        System.out.println(kmPerHour);
    }
}