package com.wj.autresAlgorithmes;

import java.util.Scanner;

/**
 * Ecrire un programme Java qui calcul la somme
 * des 100 premiers entiers
 */
public class Somme100erEntier {
    public static void main(String[] args) {
        int somme = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez un nombre : ");
        int nb = 0;
        while (nb != -1)
        {
            nb = sc.nextInt();
            for(int i=0; i<nb; i++) {
                somme += i;
                System.out.println(somme);
            } 
            //somme = 0;
        }

        System.out.println("Au revoir !!!");

/*
        System.out.println(somme);
*/
    }
}
