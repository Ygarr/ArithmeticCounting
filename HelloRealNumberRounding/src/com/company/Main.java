package com.company;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
        В переменной n хранится вещественное число с ненулевой дробной частью.
        Создайте программу,
        округляющую число n до ближайшего целого и выводящую результат на экран.
        */

        double n = 123.789;

        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Double:");
        try {
            n = Double.parseDouble(bReader.readLine());
        } catch(NumberFormatException nfe) {
            System.err.println("Invalid Format! Using 123.789 \n");
        }

        //округление путём приведения
        int n_int = (int) n;

        //округление с Math
        int n_int_math = (int)Math.round(n);

        System.out.println("Результат округления приведением: " + n_int + "\n");
        System.out.println("Результат округления с Math: " + n_int_math + "\n");

    }
}
