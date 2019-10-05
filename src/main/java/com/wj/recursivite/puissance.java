package com.wj.recursivite;

import java.util.Scanner;

public class puissance {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre et sa puissance : ");
        double nb = sc.nextDouble();
        int m = sc.nextInt();
        System.out.println(puissance(nb, m));
    }
    
     public  static double puissance(double x, int n) {
        if(n == 0)
            return 1;
        else
            return x*puissance(x, n-1);
    }

    /**
     *x=2 et n=4
     * x*puissance(n-1)                             n=4
     *   x*puissance(n-1)                           n=3
     *      x*puissance(n-1)                        n=2
     *        x*puissance(n-1)                      n=1
     */

}
