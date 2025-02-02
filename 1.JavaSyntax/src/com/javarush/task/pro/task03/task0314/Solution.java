package com.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Сломанная клавиатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();

        if (secret.equalsIgnoreCase(password))
            System.out.println("доступ разрешен");
        else
            System.out.println("доступ запрещен");
    }
}
