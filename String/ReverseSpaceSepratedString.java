/**
 * Reverse space seprated String 
 * Problem : you are given a string s, where every word seprated by spaces & these are no extra spaces at the start and end of the string 
 * your task is to the reverse the String given String word by word 
 * 
 * input s = "Hello everyone how are you Guys!"
 * output = Guys! you are how everyone Hello
 */

import java.util.*;

public class ReverseSpaceSepratedString{
    public static String revWordOfString(String s){
        //step 1 make character Array
        int n = s.length();
        char []arr = new char[n];
        for(int i = 0; i<n; i++){
            arr[i] = s.charAt(i);
        }

        //step 2 reverse entire array
        reverseArray(arr, 0, n-1);

        //step 3 reverse word string
        int i = 0; 
        int j = 0;
        while(j<n){
            if(arr[j] == ' '){
                reverseArray(arr, i , j-1);
                i = j+1;
            }
            j++;
        }
        reverseArray(arr, i , j-1);
        return new String(arr);

    }
    public static void reverseArray(char[]arr, int i , int j){
        while(i<j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        // String s = "Hello everyone how are you";
        System.out.println(revWordOfString(s));
    }
}