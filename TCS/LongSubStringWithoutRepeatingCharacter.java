/**
 * Longest Substring Without Repeating Characters
 * 
 * Given a string s, find the length of the longest substring without duplicate characters.
 * 
 * 
 * Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 
 * 
 * 
 */
import java.util.*;

public class LongSubStringWithoutRepeatingCharacter {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int n = s.length();
        Set<Character>set = new HashSet<>();
        int i = 0; 
        int j = 0;
        int ans = 0;
        
        while(i<n){
            char ch = s.charAt(i);
            while(set.contains(ch)){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(ch);
            int length = i - j + 1;
            ans = Math.max(length, ans);
            i++;
        }
        System.out.println(ans);
    }
}
