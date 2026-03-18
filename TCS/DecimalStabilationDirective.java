/**
 * Q9. The Decimal Stabilization Directive
In the Central Financial Regulator’s computational engine, massive numeric values are processed as
strings to prevent overflow in distributed systems.
Your mission is to round the given numeric string str to the nearest multiple of 10.
Rules:
• If two multiples are equally distant, select the smaller multiple.
• The number may be extremely large.
Input Format
A single numeric string str.
Output Format
Return the rounded multiple as a string.
Constraints
1 ≤ |str| ≤ 10^5
Test Cases
Input:
29
Output:
30
Input:
15
Output:
10
Input:
123456789
Output:
123456790
 * 
 * 
 */
import java.util.*;
public class DecimalStabilationDirective {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int n = s.length();
        char last = s.charAt(n-1);
        StringBuilder sb = new StringBuilder(s);
        if(last <= 5){
            sb.setCharAt(n-1, '0');
        }
        else{
            int i = n-1;
            while(i>=0){
                if(sb.charAt(i) == '9'){
                    sb.setCharAt(i, '0');
                    i--;
                }else{
                    sb.setCharAt(i, (char)(sb.charAt(i) +1));
                    break;
                }
            }
            //if all char is 999
            if(i<0){
                sb.insert(0,1);
            }
            //last digit 0 
            sb.setCharAt(sb.length()-1 , '0');
        }
        System.out.println(sb.toString());
       
    }

}
