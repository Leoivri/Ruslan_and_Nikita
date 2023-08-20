package com.itproger;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.print("Введите выражение: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String buffer = "";
        float number_1 = 0;
        char operation = 0;
        float number_2 = 0;
        float answer;

        for (int i = 0; i < input.length(); i++) {

            char simbol = input.charAt(i);

            if (simbol == ' ') {
                continue;
            }
            if (simbol == '+' || simbol == '-' || simbol == '*' || simbol == '/') {
                operation = simbol;
                number_1 = Float.parseFloat(buffer);
                buffer = "";
            }
            else {
                buffer += simbol;
            }
            if (i == input.length() -1) {
                number_2 = Float.parseFloat(buffer);
            }
        }

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

        else {
            answer = 0;
            System.out.println("Некорректный ввод.");
            return;
        }

        System.out.println("Ответ: " + answer);
    }
}
