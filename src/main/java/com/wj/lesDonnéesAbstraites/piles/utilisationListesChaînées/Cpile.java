package com.wj.lesDonnéesAbstraites.piles.utilisationListesChaînées;

import java.util.ArrayList;
import java.util.List;

public class Cpile {
    List<Caractere> listCaractere;
    
    public Cpile() {
        this.listCaractere = new ArrayList<>();
    }
    
    public void empiler(char c) {
        Caractere caractere = new Caractere(c);
        listCaractere.add(caractere);
    }
    
    public char depiler() {
        int i = listCaractere.size()-1;
        Caractere caractere = listCaractere.get(i);
        listCaractere.remove(i);
        return caractere.getDonnee();
    }
    
    public boolean pile_vide() {
        int i = listCaractere.size()-1;
        return listCaractere.size()==0;
    }
}
