package com.wj.GestionDesDonnees.exercices.conversion_nombre_decimal_en_base_N_2_36;


public class ConversionNombreDecimal {
    
    private int nombre_A_Convertir;
    private int baseDeConversion;
    
    
    public ConversionNombreDecimal() {
    }
    
    public void  getConversion(int nombre_A_Convertir, int baseDeConversion) {
        int quotient = nombre_A_Convertir;
        char lettre = 0;
        String affichage = "";
        if(baseDeConversion > 1 && baseDeConversion < 37) {
            while(quotient != 0) {
                int reste = quotient % baseDeConversion;
                quotient /= baseDeConversion;

                if(reste >= 0 && reste <= 9)
                    lettre = (char) (reste+48);
                else 
                    lettre = (char) (reste + 55);
                affichage += lettre;
            }
            System.out.println(nombre_A_Convertir + " en base " + baseDeConversion + " = " + affichage);

        } else {
            System.out.println("La base doit être comprise entre 2 et 36");
        }
        
    }
    
}
