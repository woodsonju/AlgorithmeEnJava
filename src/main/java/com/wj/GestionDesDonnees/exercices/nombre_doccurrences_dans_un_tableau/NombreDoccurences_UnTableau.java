package com.wj.GestionDesDonnees.exercices.nombre_doccurrences_dans_un_tableau;

import java.util.Scanner;

/**
 * Pour chaque valeur de la liste, on parcourt la partie gauche du tableau puis la partie 
 * droite si le nombre n'est pas trouvé. 
 * Avec une liste de N valeurs ne contenant aucun doublon, on effectue N*(N-1) calculs.
 * Compexité algorithmique O(N^2)
 */
public class NombreDoccurences_UnTableau {
    
    static final int TAILLE = 100;
    private int[] tab;
    private int nbelements;
    private int nb;
    
    
    public NombreDoccurences_UnTableau() {
        this.nbelements=0;
        tab = new int[TAILLE];
        System.out.println("Entrez une liste de nombres entiers positifs");
        System.out.println("Terminée par -1, avec ou sans doublons : ");
        System.out.println("ex: 1 2 23 2 6 7 1 19 -1");
        Scanner sc = new Scanner(System.in);
        while (nb != -1 && nbelements < TAILLE) {
            nb = sc.nextInt();
            insertion_fin_de_liste(nb);
        }
        sc.close();
    }

    public void insertion_fin_de_liste(int nb) {
        tab[nbelements++] = nb;
        if(nb == -1)
            nbelements--;   //On enlève le -1 dans tab
        else
            System.out.println("Nombre de valeur limité à : " + TAILLE);
    }
    
    public void affiche_liste() {
        System.out.println("Contenu du tableau : ");
        for(int i=0; i<nbelements; i++)
            System.out.println(tab[i]);
    }
    
    public void detecte_occurrences() {
        //--- Boucle de detection des occurrences ---
        for(int i=0; i<nbelements; i++) {
            //On vérifie que cette élément n'a pas été déjà traité dans le cas des doublons
            boolean trouve = false;
            for(int j=0; j<i; j++) {
                if(tab[i] == tab[j])
                    trouve = true;
            }
            if(!trouve) { //On comptabilise ses occurences, si c'est la prémiers fois qu'on traite l'élément 
                int occurences = 1;
                for(int j=i+1; j<nbelements; j++) {
                    if(tab[i] == tab[j])
                        occurences++;
                }
                System.out.println("Occurences : " + occurences);
            }
        }
    }
}
