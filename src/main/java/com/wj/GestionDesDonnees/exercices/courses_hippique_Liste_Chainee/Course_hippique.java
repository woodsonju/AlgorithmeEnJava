package com.wj.GestionDesDonnees.exercices.courses_hippique_Liste_Chainee;

public class Course_hippique {
    private String nom; 
    private  int dossard; 
    private double temps;
    private int classement;

    public Course_hippique(int dossard, String nom) {
        this.nom = nom;
        this.dossard = dossard;
        this.classement = 0;
        this.temps = 0;
    }

    public Course_hippique() {
    }

    public void affiche_info() {
        System.out.println(nom + "\t" + dossard + "\t" + temps + "\t" + classement);
    }

}
