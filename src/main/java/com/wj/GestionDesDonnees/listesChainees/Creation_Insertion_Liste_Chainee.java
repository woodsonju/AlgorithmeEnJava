package com.wj.GestionDesDonnees.listesChainees;

import java.util.Locale;
import java.util.Scanner;

public class Creation_Insertion_Liste_Chainee {
    public static void main(String[] args) {
        CListeNotes listeNotes = new CListeNotes();
        listeNotes.affiche();
        System.out.println("Position d'insertion : ");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int i = sc.nextInt();
        CNote pt_element = listeNotes.rechercher_note(i);
        if(pt_element == null)
            System.out.println("Insertion impossible!!!");
        else {
            //Insertion d'un élément
            System.out.println("Insertion avant la note : " + pt_element.affiche_note());
            System.out.println("Note à insérer : ");
            double nb = sc.nextDouble();
            listeNotes.insertion_note(pt_element, nb);
        }
        sc.close();
        listeNotes.affiche();
    }
}
