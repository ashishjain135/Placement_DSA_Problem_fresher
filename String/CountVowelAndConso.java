/**
 * Count Vowels and Consonants
 * 
 * 
 * Problem

Given a string, count the number of vowels and consonants.

Input
TCSNQT
Output
Vowels: 0
Consonants: 6
Explanation

Vowels = a, e, i, o, u
Rest alphabets = consonants
 */
import java.util.*;

public class CountVowelAndConso {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        str = str.toLowerCase();
        int n = str.length();
        int Vowel = 0;
        int Consonants = 0;
        for(int i = 0; i<n; i++){
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u'){
                Vowel++;
            }else{
                Consonants++;
            }
        }
        System.out.println("Your String is "+str);
        System.out.println("Vowel : "+ Vowel);
        System.out.println("Consonants : "+ Consonants);
    }
}
