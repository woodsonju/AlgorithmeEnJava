package com.wj.GestionDesDonnees.listesChainees.gestion_des_données;

public class Cheval_De_Course {
    private String nom;
    private int dossard;
    private double temps;
    private int classement;

    public Cheval_De_Course(int dossard, String nom) {
        this.dossard = dossard;
        this.nom = nom;
        this.classement = 0;
        this.temps = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDossard() {
        return dossard;
    }

    public void setDossard(int dossard) {
        this.dossard = dossard;
    }

    public double getTemps() {
        return temps;
    }

    public void setTemps(double temps) {
        this.temps = temps;
    }

    public int getClassement() {
        return classement;
    }

    public void setClassement(int classement) {
        this.classement = classement;
    }
    
    public void afficher_info() {
        System.out.println( this.nom + "\t" + 
                this.dossard + "\t" + this.temps + "\t"+ this.classement);
    }
    

    @Override
    public String toString() {
        return "Cheval_De_Course{" +
                "nom='" + nom + '\'' +
                ", dossard=" + dossard +
                ", temps=" + temps +
                ", classement=" + classement +
                '}';
    }
}
