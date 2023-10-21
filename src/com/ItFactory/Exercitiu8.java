package com.ItFactory;

import java.util.Scanner;

public class Exercitiu8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int optiune=scanner.nextInt();
        switch(optiune) {
            case 1:
                int n = scanner.nextInt();
                if (n >= 1 && n <= 10) {
                    System.out.println("numar corect");
                }else{
                    System.out.println("numar incorect");
                }
                break;
            case 2:
                int a=scanner.nextInt();
                int b=scanner.nextInt();
                int s=a+b;
                System.out.println("suma este : "+s);
                break;
            default:
                int c=scanner.nextInt();
                if(c>0){
                    for(int i=0;i<=c;i++){
                        System.out.println(i);
                    }

                }

        }
    }
}
