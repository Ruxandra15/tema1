package com.ItFactory.Exercitiul1_2;

import java.util.Scanner;

public class AfisareNume {
    public static void main(String[] args)
    {
        //Initializez obiectul prin care am capabilitatea sa citesc de la tastatura
        Scanner scanner = new Scanner(System.in);

        //Afisesz un mesaj pentru cererea textului de la tastatura
        //Se va introduce textul cerut dupa care se apasa tasta Enter
        System.out.println("Introduceti numele dumneavoastra: ");
        System.out.println("Introduceti prenumele dumneavoastra:");

        //Linia de cod care va citi propriuzis textul de la tastatura
        //Definesc variable de tip String(sir de caractere) unde se va afisa textul introdus
        String numelePersoanei = scanner.nextLine();
        String prenumelePersoanei=scanner.nextLine();

        //Afisez numele persoanei introdus de la tastatura
        System.out.println("Numele introdus este: " + numelePersoanei);
        System.out.println("Prenumele introdus este:" +prenumelePersoanei);
    }

}
