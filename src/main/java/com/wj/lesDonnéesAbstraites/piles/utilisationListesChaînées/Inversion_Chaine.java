package com.wj.lesDonnéesAbstraites.piles.utilisationListesChaînées;

import java.util.Scanner;

public class Inversion_Chaine {
    public static void main(String[] args) {
        Cpile cpile = new Cpile();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une chaine de caractère : ");
        String chaineCaractere = sc.nextLine();
        for(int i=0; i<chaineCaractere.length(); i++) {
            char caractere = chaineCaractere.charAt(i);
            cpile.empiler(caractere);
        }
        while(!cpile.pile_vide()) {
            char caractere = cpile.depiler();
            System.out.println(caractere);
        }
    }
}
