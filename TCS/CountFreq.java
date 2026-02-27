/**
 * Counting Frequencies of Array Element
 * Problem: Count the frequency of each element in an array.
 * Test Case:
 * Input: arr = [1, 2, 2, 3, 3, 3]
 * Output: {1: 1, 2: 2, 3: 3}
 */
import java.util.*;
public class CountFreq {
    public static void main(String[]args){
        int num[] = {1, 2, 2, 3, 3, 3};
        HashMap<Integer, Integer>freq = new HashMap<>();
        for(int i = 0; i<num.length; i++){
            int ele = num[i];
            freq.put(ele, freq.getOrDefault(ele, 0) +1);

        }
        System.out.println(freq);
    }
    
}