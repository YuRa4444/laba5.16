package com.company;

public class task3 {
    public static void main(String[] args) {

        int n = (int) (Math.random() * 101);
        System.out.println("Ваше число: " + n);

        int a = 0;
        int b = 0;
        int c = 0;
        int a1;
        int b1;
        int c1;

        c1 = n % 10;

        b1 = n % 100;
        b1 = b1/10;

        a1 = n%1000;
        a1 = c1/100;

        if (b1 == 0) {
            System.out.println("У вашому числі одна цифра: "+ c1);
        }
        else if (a1 == 0){
            System.out.println("У вашому числі два цифри: "+ b1 +" i "+c1 );
        }
        else
            System.out.println("У вашому числі три цифри: " + a1 +", "+ b1 +" і "+ c1);
    }
}
