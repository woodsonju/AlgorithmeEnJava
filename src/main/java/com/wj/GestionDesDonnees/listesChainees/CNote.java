package com.wj.GestionDesDonnees.listesChainees;

public class CNote {
    //Permet de pointer sur l'élément suivant
    private CNote pt_succ; 
    //Permet de pointer sur l'élément précendent
    private CNote pt_pred;
    private double note;

    public CNote(double n) {
        //Contient l'adresse de l'élément suivant
        this.pt_succ = null; 
        //Contient l'adresse de l'élément précedent
        this.pt_pred = null;
        this.note = n;
    }
    
    //On change l'élément suivant
    public void change_successeur(CNote pt) {
        this.pt_succ = pt;
    }
    
    //On change l'élément précédent
    public void change_predecesseur(CNote pt) {
        this.pt_pred = pt;
    }
    
    public void change_donnee(double _note){
        this.note = _note;
    }
    
    public CNote successeur() {
        return this.pt_succ;
    }
    
    public CNote predecesseur() {
        return this.pt_pred;
    }
    
    public double affiche_note() {
        return this.note;
    }
}
