package com.wj.recursivite.recursivite_croisée;

import java.util.Scanner;

public class recursiviteCroisee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre entier : ");
        int n = sc.nextInt();
        int restU = u(n);
        int restV = v(n);
        System.out.println("u(" + n + ") = " +  restU);
        System.out.println("v(" + n + ") = " +  restV);
        System.out.print("v(" + n + ") - " + "u(" + n + ") = ");
        System.out.println(restV-restU);
    }
    
    public static int u(int nb) {
        if(nb == 0)
            return 1;
        else {
            return 3*u(nb-1)+2*v(nb-1);
        }
    }

    public static int v(int nb) {
        if(nb == 0)
            return 2;
        else
            return (2*u(nb-1)+3*v(nb-1));
    }
    
}
