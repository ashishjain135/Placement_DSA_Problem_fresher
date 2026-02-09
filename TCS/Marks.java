/**
 * takes input from user 
 * 5 subject marks
 * 1. maths
 * 2. Biology
 * 3. English
 * 4. Hindi
 * 5. Social Study
 * 
 * check condition
 * 1. if student 90>= maths && 70>= biology && 80%>= total ->> print JEE
 * 2. if student 90>= Biology && 60% >= total 
 * print ->> Medical
 * 3. if both conditon stisfy print JEE and Medical
 *  4. if both condition fail print ->>Fail
 * 
 */

import java.util.Scanner;

public class Marks {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int maths = scn.nextInt();
        int bio = scn.nextInt();
        int eng = scn.nextInt();
        int hindi = scn.nextInt();
        int social = scn.nextInt();
        
        //restric user input only valid value
        if(maths < 0 || maths >100 || bio < 0 || bio > 100 || eng <0 || eng >100 || hindi < 0 || hindi > 100 || social < 0 || social > 100){
            System.out.println("Please enter your valid marks");
            return;
        }

            int totalMarks = maths+ bio + eng+ hindi+ social; 
            double percentage = (totalMarks/500.0)*100; 
            System.out.println(totalMarks);
            System.out.printf("%.2f\n", percentage);

        
        //if student fail in any subject
        if(maths <= 30 || bio <= 30 || eng <= 30 || hindi <= 30 || social <= 30){
            System.out.println("Fail");
            return;
        }

        boolean jee = (maths >= 90 && bio >= 70  && percentage > 80);
        boolean medical = (bio >= 90 && percentage > 60);

        if(jee && medical){
            System.out.println("JEE, Medical");
        }else if(jee){
            System.out.println(" JEE");
        }else if(medical){
            System.out.println("Medical");
        }else{
            System.out.println("fail");
        }
    }
}
