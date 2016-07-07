package com.company;

import java.io.Console;
import java.io.IOException;



public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int n = 99;

        System.out.println("Введите натуральное двузначное число");
        Console cnsl = null;
        try {

            cnsl = System.console();

            if (cnsl != null) {
                n = Integer.parseInt(cnsl.readLine(" Вводите: "));
                System.out.println("Введено! : " + n);
            }
        } catch (Exception e) {
            System.out.println("Введено некорректное значение. Берем 99.");
        }

        int b=n%10;
        int c=(n/10)%10;
        System.out.println("Сумма цифр двузначного числа: " + n +" Это: " + b + "+"+ c + " = " + (b+c) + "\n ");
        /*
         В переменной n хранится натуральное двузначное число.
         Создайте программу,
         вычисляющую и выводящую на экран сумму цифр числа n.
        */
        while (n != 0) {
            sum = sum + (n % 10);
            n /= 10;
        }
        System.out.println("Сумма цифр любого числа: " + sum + " ");

        //Pause
        try {
            cnsl = System.console();
            if (cnsl != null) {
                cnsl.format("\nPress ENTER to proceed.\n");
            }
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
