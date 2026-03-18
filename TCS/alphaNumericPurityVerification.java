/**
 * Problem :- The Alphanumeric Purity Verification Protocol
 * Within the Grand Archive of Computational Manuscripts, ancient texts are often corrupted by
ornamental glyphs, spacing distortions, and erratic casing introduced during digital migration.
A manuscript is declared structurally symmetrical if, after applying purification rules, its character
sequence reads identically forward and backward.
Purification Rules:
• Only alphabetic characters (a–z, A–Z) and digits (0–9) are considered.
• All symbols and whitespace must be ignored.
• Character comparison is case-insensitive.
Your mission is to validate whether each submitted manuscript qualifies as symmetrical under these
strict archival standards.
Input Format
• First line: Integer T
• Next T lines: String S
Output Format
Print Yes if symmetrical, otherwise print No.
Constraints
1 ≤ T ≤ 100
1 ≤ |S| ≤ 10^4
Test Cases
Input:
2
N2 i&nJA?a& jnI2n
A1b22Ba
Output:
Yes
No
Input:
3
codingninjassajNiNgNidoc
5?36@6?35
aaBBa@
 * 
 */
import java.util.*;
public class alphaNumericPurityVerification{
    public static boolean checkPalindrome(String s){
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i<j){
            char chi = s.charAt(i);
            char chj = s.charAt(j);
            if(!Character.isLetterOrDigit(chi)){
                i++;
            }else if(!Character.isLetterOrDigit(chj)){
                j--;
            }else {
                if(Character.toLowerCase(chi) != Character.toLowerCase(chj)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine(); //avoid space line 
        while(n > 0){
            String str1 = scn.nextLine();
            // /str1 = str1.trim().replaceAll("\\s"," ");
            System.out.println(checkPalindrome(str1));
            n--;
        }
    }
}