package com.itproger;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Переменные и типы данных и ввод");
        System.out.print("Введи число: ");

        Scanner scanner = new Scanner(System.in);

        int number_1 = scanner.nextInt();

        System.out.println(number_1);

    }

}
