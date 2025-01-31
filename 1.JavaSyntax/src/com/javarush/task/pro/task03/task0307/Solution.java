package com.javarush.task.pro.task03.task0307;

import java.util.Scanner;

/* 
Работать или не работать - вот в чем вопрос
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());

        if (20 > age || age > 60)
            System.out.println("можно не работать");
    }
}
