package com.company;

public class task2 {
    public static void main (String[] args) {
        int a = 3;
        int b = 4;
        System.out.println("Катети трикутника:" + a + ","+ b );

        int a2 = a*a;
        int b2 = b*b;
        System.out.println("квадрат катетів:"+ a2 +", " + b2);

        int c = a2 +b2;
        double sqrtC = Math.sqrt(c);
        System.out.println("Гіпотенуза трикутника = "+ (int) sqrtC);

        float d = 0.5f;
        float s = d*a*b;
        System.out.println("Площа трикутника = " +(int)s );
    }
}
