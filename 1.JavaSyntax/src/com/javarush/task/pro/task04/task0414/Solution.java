package com.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошего не бывает много
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);

        String str = console.nextLine();
        int number = Integer.parseInt(console.nextLine());

        int i = number;
        do {
            System.out.println(str);
            i--;
        } while (0 < i && i < 4);
    }
}