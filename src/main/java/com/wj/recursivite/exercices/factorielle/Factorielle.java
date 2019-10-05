package com.wj.recursivite.exercices.factorielle;

import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre positif : ");
        int nb = sc.nextInt();
        int fctNB = factorielle(nb);
        System.out.println(nb + "!" + "=" + fctNB);
        
    }
    
    static int factorielle(int n) {
        if(n<0) {
            return 0;
        } else if(n == 0 || n== 1)
            return 1;
        else
            return n*factorielle(n-1);
    }
}
