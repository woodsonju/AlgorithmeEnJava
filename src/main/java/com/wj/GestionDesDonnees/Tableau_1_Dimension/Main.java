package com.wj.GestionDesDonnees.Tableau_1_Dimension;

public class Main {
    public static void main(String[] args) {
        CTabNotes.loadListNotes();
        CTabNotes.affichage();
        
       // CTabNotes.moyenneNotes();
        //CTabNotes.chercherNote();
        
/*        CTabNotes.insererNote();
        CTabNotes.affichage();
        */
        CTabNotes.supprimerNote();
        CTabNotes.affichage();
 /*       
        CTabNotes.inverserNotes();
        CTabNotes.affichage();*/
    }
}
