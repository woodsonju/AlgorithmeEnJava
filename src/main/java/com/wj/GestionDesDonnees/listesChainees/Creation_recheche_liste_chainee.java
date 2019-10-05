package com.wj.GestionDesDonnees.listesChainees;

import java.util.Locale;
import java.util.Scanner;

public class Creation_recheche_liste_chainee {
    public static void main(String[] args) {
        CListeNotes listeNotes = new CListeNotes();
        listeNotes.affiche();
        System.out.println("Numéro de l'élément à rechercher : ");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int i = sc.nextInt();
        CNote pt_element = listeNotes.rechercher_note(i);
        if(pt_element == null)
            System.out.println("Element non trouvé !!");
        else
            System.out.println("note = " + pt_element.affiche_note());
        sc.close();
    }
}
