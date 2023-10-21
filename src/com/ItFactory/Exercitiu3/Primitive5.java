package com.ItFactory.Exercitiu3;

import java.util.Scanner;

public class Primitive5 {
    /***
     * Creati un program simplu in care sa calculati si sa afisati perimetrul unui triunghi
     *  Pentru aceasta va trebui sa definiti variabilele necesare si sa afisati rezultatul
     * System.out.println("Perimetrul triunghiului este: " + perimetruTriunghi);
     *
     * Ce este perimetrul unui triunghi?
     *** Este suma lungimilor laturilor
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int l1=scanner.nextInt();
        int l2=scanner.nextInt();
        int l3=scanner.nextInt();
        int perimetru;
        perimetru=l1+l2+l3;
        System.out.println("perimetrul triunghiului este :" +perimetru);
    }
}
