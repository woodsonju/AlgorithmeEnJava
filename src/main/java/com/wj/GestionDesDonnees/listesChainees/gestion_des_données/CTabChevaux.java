package com.wj.GestionDesDonnees.listesChainees.gestion_des_données;

import java.util.Locale;
import java.util.Scanner;

public class CTabChevaux {
    public static final int NB_CHEVAUX = 100;
    private  Cheval_De_Course[] tab_chevaux; //On met tous les cheveaux
    private int nbchevaux; 
    
    public CTabChevaux() {
        nbchevaux = 0;
        tab_chevaux = new Cheval_De_Course[NB_CHEVAUX];
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int num_dossard = 1;
        while(num_dossard != 0) {
            System.out.println("Dossard du cheval (0 pour terminer : ");
            num_dossard = sc.nextInt();
            if(num_dossard != 0) { // Saisie du nom
                String nom_cheval;
                System.out.println("Nom du cheval : ");
                nom_cheval = sc.next();
                Cheval_De_Course cheval_de_course = new Cheval_De_Course(num_dossard, nom_cheval);
                insertion_fin_de_liste(cheval_de_course);
            }
        }
    }

    public void insertion_fin_de_liste(Cheval_De_Course nouveau_cheval) {
        if(nbchevaux < NB_CHEVAUX)
            tab_chevaux[nbchevaux++] = nouveau_cheval;
        else
            System.out.println("nombre de cheval limité à " + NB_CHEVAUX);
    }
    
    public void affiche() {
        System.out.println("--- Liste des chevaux ---");
        System.out.println("Nom" + "\t" + "Dossard" + "\t" + "Temps" + "\t" + "Classement");
        for(int i=0; i<nbchevaux; i++)
            tab_chevaux[i].afficher_info();
    }
}
