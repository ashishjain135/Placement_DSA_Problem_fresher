/**
 * IsMagic if sum of digit is 1 so print "IsMagic "
 * otherwise "NoMagic"
 * problem:
 * Input: 83557 
 * output: IsMagic 
 * 
 * explain 
 * 8+3+5+5+7 = 28
 * 2+8 = 10 
 * 1+0 = 1 
 */
import java.util.*;
public class isMagic {
    public static int SumOfDigit(int A){
        if(A == 0){
            return 0;
        }
        int k = SumOfDigit(A / 10);
        return (k + A % 10);
    }
    public static boolean solve(int A){
        while(A >= 10){
            A = SumOfDigit(A);
        }
        if(A == 1){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(solve(n)){
            System.out.println("IsMagic");
        }else{
            System.out.println("No magic");
        }

    }
}
