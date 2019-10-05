package com.wj.GestionDesDonnees.Tableau_1_Dimension;

import java.util.Locale;
import java.util.Scanner;

public class CTabNotes {
    static final int TAILLE = 100;
    private  static double[] list_notes;
    private  static int nbnotes = 0;
    
    public static void loadListNotes() {
        double nb = 0;
        list_notes = new double[TAILLE];
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Entrez une liste de notes (-1 pour terminer) : ");
        while(nb != -1 & nbnotes < TAILLE) {
            nb = sc.nextDouble();
            list_notes[nbnotes++] = nb;

        }
        if(nb == -1) 
            nbnotes--;
        else
            System.out.println("nombre de note limité à " + TAILLE);
    }
    
    public static void affichage() {
        System.out.println("Listes notes ");
        for(int i=0; i<nbnotes; i++) {
            System.out.println(list_notes[i]);
        }
    }
    
    public static void moyenneNotes() {
        double somme = 0;
        for (int i=0; i<nbnotes; i++){
            somme += list_notes[i];
        }  
        double moyenne = somme / nbnotes;
        System.out.println("Moyenne : " + moyenne);
    }
    
    public static void chercherNote() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        boolean trouve = false;
        int i = 0;
        System.out.println("Note à chercher : ");
        double note_recherche = sc.nextDouble();
        while (!trouve && i < nbnotes) {
            if(note_recherche == list_notes[i]) {
                trouve = true;
                int numcase = i;
                System.out.println("Numéro de case : " + i + " => " + "Note = " + note_recherche);
            }  
            else
                i++;
        }
        if(!trouve)
            System.out.println("Note non trouvé dans la liste");
    }
    
    public static void insererNote() {
        if(nbnotes == TAILLE) {
            System.out.println("Insertion d'une nouvelle note impossible");
            System.out.println("La liste contient" + nbnotes + " notes");
        } 
        else {
            Scanner sc = new Scanner(System.in);
            sc.useLocale(Locale.US);
            System.out.println("Note à insérer : ");
            double note_a_inserer = sc.nextDouble();
            System.out.println("Position : ");
            int position = sc.nextInt();
            if(position <= 0 || position > nbnotes) {
                System.out.println("Position incorrect dans une liste");
                System.out.println("de " + nbnotes + " notes");
            } 
            else {
                int numcase = position - 1;
                for(int i=nbnotes; i>numcase; i--) {
                    list_notes[i] = list_notes[i-1];
                }
                list_notes[numcase] = note_a_inserer;
                nbnotes++;
            }
        }
    }
    
    public static void supprimerNote() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Position de la note à supprimer : ");
        int position = sc.nextInt();
        int numcase = position - 1;
        if(position<=0 || position>=nbnotes) {
            System.out.println("Position incorrect dans une liste");
            System.out.println("de " + nbnotes + " notes"); 
        } else {
            for(int i=numcase; i < nbnotes; i++) {
                list_notes[i] = list_notes[i+1];
            }
            nbnotes--;
        }
    }
    
    public static void inverserNotes() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Position des deux notes à inverser : ");
        int pos1 = sc.nextInt();
        int pos2 = sc.nextInt();
        if(((pos1>0)&&(pos1<=nbnotes)) && ((pos2>=0)&&(pos2<=nbnotes))) {
            double nb = list_notes[pos1];
            list_notes[pos1] = list_notes[pos2];
            list_notes[pos2] = nb;
        }
    }
}
