package com.javarush.task.pro.task04.task0402;

import java.util.Scanner;

/* 
Все любят Мамбу
*/

public class Solution {
    public static void main(String[] args) {
        String text = " любит меня.";
        //напишите тут ваш код
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int count = 1;

        while (count <= 10) {
            System.out.println(name + text);
            count++;
        }
    }
}
