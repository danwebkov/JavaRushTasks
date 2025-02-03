package com.javarush.task.pro.task04.task0406;

import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код

        Scanner scan = new Scanner(System.in);
        while (true) {
            String input = scan.nextLine();
            if (input.equals("enough")) {
                break;
            }
            System.out.println(input);
        }
    }
}