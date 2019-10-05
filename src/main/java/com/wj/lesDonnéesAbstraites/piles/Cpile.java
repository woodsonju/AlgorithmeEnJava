package com.wj.lesDonnéesAbstraites.piles;

public class Cpile {
     private static final int TAILLE=100;
     private char[] pile;
     private int nbelements;

    public Cpile() {
        pile = new char[TAILLE];
        nbelements = 0;
    }
    
    public void initialiser_pile() {
        nbelements = 0;
    }
    
    public void empiler(char element) {
        pile[nbelements++] = element;
    }
    
    public char depiler() {
        return pile[--nbelements];
    }
    
    public boolean pile_vide() {
       if(nbelements == 0) 
           return true;
       else
           return false;
    }
}
