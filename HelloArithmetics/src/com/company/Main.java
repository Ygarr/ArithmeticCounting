package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int q = 21;
        int w = 8;

        Scanner in = new Scanner(System.in);

        System.out.print("Деление с остатком. Введите натуральное число. Enter для 21: \n");


        if ( !in.nextLine().trim().isEmpty() ) { //TODO: прмсвоить переменной "in"-поток?

            System.out.print("Повторите! \n");//TODO: убрать проверку?

            if ((in.hasNextInt())) {
                q = in.nextInt();
                System.out.print("Введено значение "+ q +", целое \n");
                in.nextLine();
            } else {
                in.nextLine(); //discard bad input
                System.out.print("Не верное значение. Берем значение по-умолчанию \n"); }


        } else {System.out.print("Пустое значение  \n");}


        System.out.print("Введите второе натуральное число. Default = 8: \n");

        if (!in.nextLine().trim().isEmpty()) {
            System.out.print("Ещё раз. \n");
            if (in.hasNextInt()) {
                w = Integer.parseInt(in.next());
            } else { in.nextLine();System.out.print("Значит 8 \n"); }
        } else { System.out.print("Пустое значение. Берём 8 \n");}

        //q/w возвращает целую часть так как тип int возвращается автоматически.
        System.out.println(q +"/"+ w +" = "+ q/w  +" и "+ q%w +" в остатке");

        promptEnterKey();

        in.close();//если более одного сканнера в классе

    }


    public static void promptEnterKey() {
        System.out.println("Press \"ENTER\" to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }


}
