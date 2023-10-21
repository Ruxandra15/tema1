package com.ItFactory;

import java.util.Scanner;

public class Exercitiu6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        while(a%7!=0){
            int b=scanner.nextInt();
            a=b;
        }
    }
}
