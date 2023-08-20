package com.itproger;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.print("Введите выражение через пробел: ");

        Scanner scanner = new Scanner(System.in);

        int number_1 = scanner.nextInt();
        char operation = scanner.next().charAt(0);
        int number_2 = scanner.nextInt();
        int answer = 0;

        if (operation == '+') {
            answer = number_1 + number_2;
        }

        else if (operation == '-') {
            answer = number_1 - number_2;
        }

        else if (operation == '*') {
            answer = number_1 * number_2;
        }

        else if (operation == '/') {
            if (number_2 == 0) {
                System.out.println("На ноль делить нельзя!");
                return;
            }
            answer = number_1 / number_2;
        }

        System.out.println("Ответ: " + answer);
    }
}
