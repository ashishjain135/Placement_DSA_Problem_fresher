/**
 * Longest Palindrome subString
 * problem: Given a String 's' return longest palindrome subString
 * String s = "abracarabra"
 * ans = "racar"
 */


public class LongestPalindromeSubString{
    public static String lps(String s){
        if(s.length() == 0) return "";

        int start = 0;
        int end = 0;
        for(int i = 0; i<s.length(); i++){
            int len1 = expandAround(s, i-1, i+1); // aba check i-1, i +1 
            int len2 = expandAround(s, i, i+1); // abba -> bb is a center i , i+1 
            int len = Math.max(len1, len2);

            if(len > end - start +1) {
                start  = i - (len -1)/2;
                end = i + len/2;

            }
        }
        String ans = "";
        for(int i = start; i<=end; i++){
            ans += s.charAt(i);

        }
        return ans;
    }
    public static int expandAround(String s, int i , int j){
        while(i >= 0 && j<s.length() && (s.charAt(i) == s.charAt(j))){
            i--;
            j++;
        }
        return j -i -1;
    }
    public static void main(String[]args){
        String s = "abracarabra";
        System.out.println(lps(s));
    }
}