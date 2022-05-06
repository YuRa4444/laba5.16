package com.company;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        int a1 = (int) (Math.random() *3+1);
        int a2 = (int) (Math.random() *3+1);
        int a3 = (int) (Math.random() *3+1);

        Scanner v1 = new Scanner(System.in);
        Scanner v2 = new Scanner(System.in);
        Scanner v3 = new Scanner(System.in);
        Scanner v4 = new Scanner(System.in);
        Scanner v5 = new Scanner(System.in);
        Scanner v6 = new Scanner(System.in);

        System.out.println("Введіть три числа від 1 до 3");
        int d1 = v1.nextInt();
        int d2 = v2.nextInt();
        int d3 = v3.nextInt();

        if (a1==d1 && a2==d2 && a3==d3) {
            System.out.println("Ви перемогли в лотереї :) ");
        }
        else {
            System.out.println("Ви не вгадали, спробуйте ще раз");
        }

        System.out.println("Введіть знову три числа від 1 до 3");

        int d4 = v4.nextInt();
        int d5 = v5.nextInt();
        int d6 = v6.nextInt();

        if (a1==d4 && a2==d5 && a3==d6) {
            System.out.println("Ви перемогли в лотереї :)");
        }
        else {
            System.out.println("Ви програли");
        }


        System.out.println("Програма згенерувала такі числа:");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
