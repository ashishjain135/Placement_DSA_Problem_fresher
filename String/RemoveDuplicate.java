/**
 * Remove Duplicate From a String Array 
 * Problem: Given an array of String, remove all duplicate String And return the updated Array
 * TestCase 
 * Input : 
 * arr[] = ["Apple", "Banana", "Orange", "Banana", "Apple"];
 * 
 * Output :
 * ["Apple","Banana", "Orange"]
 * 
 * 
 * we need to remove duplicate strings while preserving their original order.
I used a HashSet to track already-seen elements because it provides O(1) lookup.
While iterating over the array, if the string is not present in the set, I add it to both the set and the result list.
This ensures uniqueness and maintains order.
The time complexity is O(N) and space complexity is O(N).
 */

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[]args){
        String[] arr = {"Apple", "Banana", "Orange", "Banana", "Apple"};
        //use Set for storing unique 
        HashSet<String>set = new HashSet<>();
        //result ArrayList 
        ArrayList<String>result = new ArrayList<>();
        for(String s : arr){
            if(set.add(s)){
                result.add(s);
            }
        }
        System.out.print(result);
    }
}
