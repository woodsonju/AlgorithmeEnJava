package com.wj.GestionDesDonnees.listesChainees.gestion_des_données;

import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class CVectChevaux {

    private Vector<Cheval_De_Course> vect_cheveaux;
    
    public CVectChevaux() {
        vect_cheveaux = new Vector<>();
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        int num_dossard = 1;
        while (num_dossard != 0) {
            System.out.println("Dossard du cheval (0 pour terminer : ");
            num_dossard = sc.nextInt();
            if (num_dossard != 0) { // Saisie du nom
                String nom_cheval;
                System.out.println("Nom du cheval : ");
                nom_cheval = sc.next();
                Cheval_De_Course cheval_de_course = new Cheval_De_Course(num_dossard, nom_cheval);
                insertion_fin_de_liste(cheval_de_course);
            }
        }
    }

    public void insertion_fin_de_liste(Cheval_De_Course cheval_de_course) {
        vect_cheveaux.add(cheval_de_course);
    }
    
    public void affiche() {
        System.out.println("--- Liste des chevaux ---");
        System.out.println("Nom" + "\t" + "Dossard" + "\t" + "Temps" + "\t" + "Classement");
        for(int i=0; i<vect_cheveaux.size(); i++)
            vect_cheveaux.get(i).afficher_info();
    }
    
}

