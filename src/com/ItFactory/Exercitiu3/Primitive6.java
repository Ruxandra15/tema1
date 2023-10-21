package com.ItFactory.Exercitiu3;

import java.util.Scanner;

public class Primitive6 {
    /***
     * Creati un program simplu in care sa calculati si sa afisati aria unui dreptunghi.
     * Pentru aceasta va trebui sa definiti variabilele necesare si sa afisati rezultatul
     * System.out.println("Aria dreptunghiului este: " + arieDreptunghi);
     *
     * Ce este aria unui dreptunghi?
     *** Este produsul lungimii si al latimii
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int lungime=scanner.nextInt();
        int latime=scanner.nextInt();
        int arie=lungime*latime;
        System.out.println("aria dreptunghiului este: "+arie);

    }



}
