package com.wj.recursivite.exercices.palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une phrase : ");
        String phrase = sc.nextLine();
        boolean isPalindrome = palindrome(phrase, 0, phrase.length()-1);
        if(isPalindrome)
            System.out.println("C'est un palindrome");
        else
            System.out.println("Ce n'est pas un palindrome");
    }
    
    static boolean palindrome(String phr, int debut, int fin) {
        while (phr.charAt(debut) == ' ') {
            debut++;
        }
        while(phr.charAt(fin) == ' ')
            fin--;
        if(debut >= fin)
            return true;
        else if(phr.charAt(debut) != phr.charAt(fin))
            return false;
        else
            return palindrome(phr, debut+1, fin-1);
    }
}
