package com.ItFactory;

import java.util.Scanner;

public class Exercitiu4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        if(b!=0){
            int r= a % b;
            System.out.println("restul impartirii este : "+r);
        }else{
            System.out.println("nu se poate efectua impartirea");
        }


    }
}
