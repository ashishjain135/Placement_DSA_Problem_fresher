/**
 * 
 * Check if a given year is a leap year or not.
 * Problem Statement:
 * Given a year, determine if it is a leap year. A leap year is defined as follows:
 * A leap year is a year that is divisible by 4, except for years that are divisible by 100 but not divisible by 400.
 * Test Cases:
 * Input: year = 2020
 * Output: true (2020 is a leap year)
 * Input: year = 1900
 * Output: false (1900 is not a leap year)
 */
import java.util.*;
public class LeapYear {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        boolean isLeapYear = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        } 
        System.out.println(isLeapYear);
    }
}
