import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Count no of SubString of A that are permutations of B
 * Problem: you are given two String a & b your task is to Count the number of SubString in a that are permutations of b . A SubString is a contiguous sequence of character with in a String
 * 
 * input 
 * A = "abcabac"
 * B = "abc"
 * 
 * output 4
 * 0-2 >> "abc"
 * 1-3 >> "bca"
 * 2-4 >> "cab"
 * 4-6 >> "bac"
 * 
 * 
 */



public class PermutationOfStringB {
    public static List<Integer> findAnagrams(String s, String p) {
        //used slinding window + freq Array
        int n = s.length();
        int m = p.length();
        //create two array 
        //1. freqP array 
        //2. window size array
        int window[] = new int[26];
        int freqP[] = new int[26];

        //ArrayList for store result
        List<Integer>result = new ArrayList<>();
        //store freqB 
        for(int i = 0; i<m; i++){
            freqP[p.charAt(i) - 'a']++;
        }

        //itetrate in s 
        for(int i = 0; i<n; i++){
            //update window 
            window[s.charAt(i) - 'a']++;

            //check if i >= p.length();
            if(i>=m){
                //remove starting freq
                window[s.charAt(i-m) - 'a']--;
            }
            //if both i>= p.length() -1 and both array equal so add in result
            if(i >= m-1){
                if(Arrays.equals(freqP, window)){
                    result.add(i - (m-1));
                }
            }
        }
        return result;
    }
    public static void main(String[]args){
        String s = "abcabac";
        String p = "abc";
        System.out.println(findAnagrams(s,p));
    }
}
