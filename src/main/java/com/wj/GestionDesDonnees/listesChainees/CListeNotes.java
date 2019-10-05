package com.wj.GestionDesDonnees.listesChainees;

import java.util.Locale;
import java.util.Scanner;

public class CListeNotes {
    private CNote pt_debut;
    private CNote pt_fin;

    public CListeNotes() {
        System.out.println("Entrez une liste de notes (-1 pour terminer): ");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        //Boucle de chargement
        double nb=0;
        while(nb != -1) {
            nb = sc.nextDouble();
            if(nb != -1)
                insertion_fin_de_list(nb);
        }
    }

    /**
     * On inserer le nouveau élément entrer par l'utilisateur dans 
     * la liste
     * @param nb
     */
    public void insertion_fin_de_list(double nb) {
        //Création du nouvel élément
        CNote pt_nouveau = new CNote(nb);
        //Ajout d'un nouvelle élément en fin de liste
        if(pt_debut == null){
            pt_debut = pt_nouveau;
            pt_fin = pt_nouveau;
        } else {
            //etape 1: On affecte le champs pt_succ au dernier élément
            pt_fin.change_successeur(pt_nouveau);
            //etape 2: On affecte le champ pt_pred à la  nouvel élément
            pt_nouveau.change_predecesseur(pt_fin);
            //étape 3: on met à jour pt_fin
            pt_fin = pt_nouveau;
        }
    }
    
    public void affiche() {
        CNote pt_courant = pt_debut;
        System.out.println("Contenu de la liste : ");
        while(pt_courant != null) {
            System.out.println(pt_courant.affiche_note());
            //L'élément Coutant pointe vers l'adresse suivant
            pt_courant = pt_courant.successeur();
        }
    }
    
    
    public CNote rechercher_note(int num) {
        int j=1;
        CNote pt_recherche =  this.pt_debut;
        while((j++<num) && (pt_recherche!=null)) 
            pt_recherche = pt_recherche.successeur();
        if((num<1) && (pt_recherche==null))
            return null;
        else
           return  pt_recherche;
    }

    /**
     * 
     * @param pt_insertion  : note courante
     * @param nb            : la note à inserer avant pt_insertion (note_courante)
     */
    public void insertion_note(CNote pt_insertion, double nb) {
        //Création du nouvelle élément
        CNote pt_nouveau = new CNote(nb);
        if(pt_insertion.predecesseur() == null) {
            pt_nouveau.change_successeur(pt_insertion);
            pt_insertion.change_predecesseur(pt_nouveau);
            pt_debut = pt_nouveau;
        }
        else {//Insertion entre deux élements
            //Chainage avec la note précendente
            CNote pt_note_precedente = pt_insertion.predecesseur(); //obtention de la note précendente
            pt_note_precedente.change_successeur(pt_nouveau);
            pt_nouveau.change_predecesseur(pt_note_precedente);
            //Chainage avec la note suivante
            CNote pt_note_suivante = pt_insertion;
            pt_note_suivante.change_predecesseur(pt_nouveau);
            pt_nouveau.change_successeur(pt_note_suivante);
        }
            
    }
    
    public void suppression_note(CNote pt_suppresion) {
        if (pt_debut == pt_fin) {
            //Un seul élément dans la liste
            pt_debut = null;
            pt_fin = null;
        }
        else if(pt_suppresion == pt_debut) {
            //Suppresion de la première élément
            CNote pt_note_suivante = pt_suppresion.successeur();
            pt_note_suivante.change_predecesseur(null);
            pt_debut = pt_note_suivante;
        } 
        else if(pt_suppresion == pt_fin) {
            //Suppression du dernier élément
            CNote pt_note_precedente = pt_suppresion.predecesseur();
            pt_note_precedente.change_successeur(null);
            pt_fin = pt_note_precedente;
        }
        else {
            //Suppresion dans la liste
            CNote pt_note_precedente = pt_suppresion.predecesseur();
            CNote pt_note_suivante = pt_suppresion.successeur();
            pt_note_precedente.change_successeur(pt_note_suivante);
            pt_note_suivante.change_predecesseur(pt_note_precedente);
        }
        //Destruction de la note extraite de la liste
        pt_suppresion=null;
    }
    
}
