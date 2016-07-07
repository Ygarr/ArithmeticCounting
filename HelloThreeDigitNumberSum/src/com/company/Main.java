package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        В переменной n хранится натуральное трёхзначное число.
        Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
        */
        int n = 999;
        int sum = 0;

        System.out.print("Bвод натурального трёхзначного числа - ");

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
        } else {
            System.out.print(" Введено не то. Используем число 999 по-умолчанию \n ");
        }

        //отсекаем с конца, путём взятия остатка от деления на "порядок" т.е.десять.
        System.out.println("Сумма цифр трёхзначного числа " +n +" равна "+( (n%10) + ((n/10)%10) + ((n/100)%10) ) );

        while (n != 0) {
            sum = sum + (n % 10);
            n /= 10;
        }
        System.out.println(" Сумма цифр любого нат. числа полностью: " + sum + " \n");


    }
}
