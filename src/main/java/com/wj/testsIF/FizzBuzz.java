package com.wj.testsIF;

/**
 * nb divisible par 3 : Fizz
 * nb divisible par 5 : Buzz
 * nb divisible par 3 et 5 : FizzBuzz
 */
public class FizzBuzz {
    
    public static void main(String[] args) {
        String result = "";
        final int TAILLE = 17;

        /**
         * IF 
         * IF 
         * ELSE
         */
        for(int nb=1; nb < TAILLE; nb++) {
            if(nb % 3 == 0)
                result += "Fizz";
            if(nb % 5 == 0)
                result += "Buzz";
            else
                result += nb;
        }
        System.out.println(result);

        /**
         * IF 
         * IF-ELSE
         * ELSE
         */
/*        for(int nb=1; nb < TAILLE; nb++) {
            if(nb % 3 == 0 && nb % 5 == 0)
                result += "FizzBuzz";
            else if(nb % 3 == 0)
                result += "Fizz";
            else if (nb % 5 == 0)
                result += "Buzz";
            else result += nb;
        }

        System.out.println(result);*/
    }

}
