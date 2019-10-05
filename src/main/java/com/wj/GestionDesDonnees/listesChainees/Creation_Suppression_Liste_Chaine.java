package com.wj.GestionDesDonnees.listesChainees;

import java.util.Scanner;

public class Creation_Suppression_Liste_Chaine {
    public static void main(String[] args) {
        CListeNotes listeNotes = new CListeNotes();
        listeNotes.affiche();
        System.out.println("Possition suppression : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        CNote pt_element = listeNotes.rechercher_note(i);
        if(pt_element == null)
            System.out.println("Suppresion impossible !!");
        else {
            listeNotes.suppression_note(pt_element);
        }
        sc.close();
        listeNotes.affiche();
    }
}
