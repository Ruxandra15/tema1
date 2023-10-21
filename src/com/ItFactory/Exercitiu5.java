package com.ItFactory;

import java.util.Scanner;

public class Exercitiu5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double p= a * b;
        double c= a / b;
        System.out.println("produsul este: " +p);
        System.out.println("impartirea este: " +c);
    }

}
