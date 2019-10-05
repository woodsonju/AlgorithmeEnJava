package com.wj.lesDonnéesAbstraites.piles.utilisationDesTableaux;

import java.util.Scanner;

public class inversion_chaine {
    public static void main(String[] args) {
        Cpile pile = new Cpile();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une chaine de caractère : ");
        String phrase = sc.nextLine();
        
        pile.initialiser_pile();
        
        for(int i=0; i<phrase.length(); i++) {
            char carac = phrase.charAt(i);
            pile.empiler(carac);
        }
        
        //Affichage
        while(!pile.pile_vide()) {
            char carac = pile.depiler();
            System.out.println(carac);
        }
    }
}
