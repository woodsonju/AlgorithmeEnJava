package com.wj.GestionDesDonnees.exercices.courses_hippique_Liste_Chainee;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class CListCheveaux {
    
    private LinkedList<Course_hippique> listChevaux;

    public CListCheveaux() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        listChevaux = new LinkedList<>();
        int num_dossard = 1;
        while(num_dossard != 0) {
            System.out.println("Dossard du cheval (0 pour terminer : ");
            num_dossard = sc.nextInt();
            if(num_dossard != 0) { // Saisie du nom
                String nom_cheval;
                System.out.println("Nom du cheval : ");
                nom_cheval = sc.next();
                Course_hippique cheval_de_course = new Course_hippique(num_dossard, nom_cheval);
                insertion_fin_de_liste(cheval_de_course);
            }
        }
        
    }

    public void insertion_fin_de_liste(Course_hippique nouveau_cheval) {
        listChevaux.add(nouveau_cheval);
    }
    
    public void affiche_list() {
        System.out.println("--- Liste des chevaux ---");
        System.out.println("Nom" + "\t" + "Dossard" + "\t" + "Temps" + "\t" + "Classement");   
        for(Course_hippique cheval : listChevaux)
           cheval.affiche_info();
    }
}
