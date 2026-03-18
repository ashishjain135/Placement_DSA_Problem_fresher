/**
 * Q3. The Embedded Treasury Aggregation System
During a forensic audit of encrypted commercial records, investigators discovered that legitimate
financial values are hidden within strings containing alphabetic interference. Every contiguous cluster
of digits represents a valid monetary entry.
Your task is to traverse the ledger string and extract all numeric clusters, interpret them as integers,
and compute their cumulative total.
Each group of consecutive digits must be treated as a single number, regardless of its length.
Constraints
1 ≤ |S| ≤ 10^5
Sum of numbers ≤ 10^5
Test Cases
Input:
1abc23
Output:
24
Input:
geeks4geeks
Output:
4
 * 
 */

import java.util.*;
public class embeddedTreasuryAggregation {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String num = "";
        int sum = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                num += ch;
            }else{
                if(!num.equals("")){
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        if(!num.equals("")){
            sum += Integer.parseInt(num);
        }
    
        System.out.println(sum);
    }
}
