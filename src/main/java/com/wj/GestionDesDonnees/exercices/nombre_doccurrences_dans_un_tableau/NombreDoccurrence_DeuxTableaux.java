package com.wj.GestionDesDonnees.exercices.nombre_doccurrences_dans_un_tableau;

import java.util.Scanner;

public class NombreDoccurrence_DeuxTableaux {
    public static final int TAILLE = 100;
    private int[] tab;
    private int[] tab_occurrences;
    private int nbelements;
    private int nb;
    
    public NombreDoccurrence_DeuxTableaux() {
        this.nbelements = 0;
        tab = new int[TAILLE];
        System.out.println("Entrez une liste de nombres entiers positifs");
        System.out.println("Terminée par -1, avec ou sans doublons : ");
        System.out.println("ex: 1 2 23 2 6 7 1 19 -1");
        Scanner sc = new Scanner(System.in);
        while (nb != -1 && nbelements < TAILLE) {
            nb = sc.nextInt();
            insertion_fin_de_liste(nb);
        }
        initialisation();
        sc.close();
    }

    public void insertion_fin_de_liste(int nb) {
        tab[nbelements++] = nb;
        if(nb == -1)
            nbelements--;
        else
            System.out.println("Nombre de valeur limité à : " + TAILLE);
    }

    public void affiche_liste() {
        System.out.println("Contenu du tableau : ");
        for(int i=0; i<nbelements; i++)
            System.out.println(tab[i]);
    }
    
    //Initialisation du tableau d'occurrences
    public void initialisation() {
        tab_occurrences = new int[TAILLE];
        for(int i=0; i<TAILLE; i++) {
            tab_occurrences[i] = 0;
        }
    }

    /**
     * On parcours la liste des entiers une fois 
     * La complexité algorithmique ne tient pas compte des boucles 
     * d'initialisation et d'affichage
     * Comlexité O(N)
     */
    public void detecte_occurrences() {
        // --Boucle de detection des occurrences --
        for(int i=0; i<nbelements; i++)  //On parcours tab contenant les élements
            //Pour chaque tab[i] on incremente 
            tab_occurrences[tab[i]] ++;  //on incremente la case
    }
    
    public void affiche_occurrences() {
        // --Boucle d'affichage occurrence
        for(int i=0; i<TAILLE; i++) {
            if(tab_occurrences[i] != 0)
                System.out.println("Occurrences : " + tab_occurrences[i]);
        }
    }
}
