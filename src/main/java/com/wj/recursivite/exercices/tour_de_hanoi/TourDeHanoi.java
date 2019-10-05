package com.wj.recursivite.exercices.tour_de_hanoi;

import java.util.Scanner;

public class TourDeHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez le nombre de disques : ");
        int nbd = sc.nextInt();
        deplacer(nbd, 1, 3, 2);
    }

    public static void deplacer(int nb_disques, int depart, int arrivee, int intermedaire) {
        if(nb_disques == 1)  //Déplacement d'un seul disque
            System.out.println(depart + " -> " + arrivee); 
        else  {     //Déplacement d'une pile de disque
            deplacer(nb_disques-1, depart, intermedaire, arrivee);      // deplacement n-1 disques vers le tour intermédiaire
            deplacer(1, depart, arrivee, intermedaire);                 // deplacement du disque n vers du tour initial vers le tour final
            deplacer(nb_disques-1, intermedaire, arrivee, depart);      // deplacememnt n-1 disque intermédiaire vers le tour final 
        }
    }

}
