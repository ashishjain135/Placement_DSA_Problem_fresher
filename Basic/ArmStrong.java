/**
 * ArmStrong 
 * 
 * 
 * Input: 153
Output: true

Explanation = 1^3 + 5^3 + 3^3 = 153
 */
import java.util.*;
 public class ArmStrong{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int armstrong = 0;
        int original = n;
        while(n > 0){
            int digit = (n % 10);
            // int num = digit * digit* digit;
            int num = (int)Math.pow(digit, 3);
            armstrong = armstrong + num;
            n = n/ 10;
        }
        System.out.println(armstrong);
        System.out.println(original);
        if(original == armstrong){
            System.out.println("True");
        }else{
            System.out.println("false");
        }
    }
 }