package additional.tasks;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");

        int number = sc.nextInt();

        System.out.println("Спасибо! Вы ввели число " + number);

        sc.close(); // don't forget close IO pipe
    }
}
