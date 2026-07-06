
/**
 * Question 1 (15 MARKS):
 *
 *  *Write a Java program that accepts an integer as input and calculates the sum
 * of its digits.
 * If the sum of the digits is divisible by 3, print "TRUE"; otherwise, print
 * "FALSE".
 * sum3
 */
import java.util.*;

public class sum3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            num = Math.abs(num);
            int number = 0;
            while (num > 0) {
                number += num % 10;
                num = num / 10;
            }
            if (number % 3 == 0) {
                System.out.print("TRUE");
            } else {
                System.out.print("FALSE");
            }
        } else {
            System.out.print("FALSE");
        }
        sc.close();
    }
}
