package com.javarush.task.pro.task03.task0302;

import java.util.Scanner;

/* 
Призывная кампания
*/

public class Solution {
    public static void main(String[] args) {
        String militaryCommissar = ", явитесь в военкомат";
        //напишите тут ваш код

        Scanner scan = new Scanner(System.in);

//        System.out.println("Введите ваше имя:");
        String firstName = scan.nextLine();
//        System.out.println("Введите ваш возраст:");
        int year = scan.nextInt();

        if (18 <= year && year <= 28) {
            System.out.println(firstName + militaryCommissar);
        }
    }
}
