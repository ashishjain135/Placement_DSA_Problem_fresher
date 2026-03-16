
/**
 * Problem Statement – An automobile company manufactures both a two wheeler (TW) and a four 
wheeler (FW). A company manager wants to make the production of both types of vehicle according to 
the given data below: 
• 1st data, Total number of vehicle (two-wheeler + four-wheeler)=v 
• 2nd data, Total number of wheels = W 
The task is to find how many two-wheelers as well as four-wheelers need to manufacture as per the 
given data. 
Example : 
Input : 
200  -> Value of V 
540   -> Value of W 
Output : 
TW =130 FW=70 
Explanation: 
130+70 = 200 vehicles 
(70*4)+(130*2)= 540 wheels 
Constraints : 
• 2<=W 
• W%2=0 
• V<W 
Print “INVALID INPUT” , if inputs did not meet the constraints. 
 */

import java.util.*;

public class twoWheeFourWhee {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v = scn.nextInt(); // total number of vehicles
        int w = scn.nextInt(); // total numbe of tyres
        System.out.println("Total number of vehicles is " + v);
        System.out.println("Total number of wheelers is " + w);
        scn.close();
        if (v >= w) {
            System.out.println("Invalid value");
            return;
        }
        int extraWheeler = (w - 2 * v);
        int numberOf4Wheelers = extraWheeler / 2;
        if (extraWheeler % 2 != 0) {
            System.out.println("Invalid value");
            return;
        }
        System.out.println("Total 4 Wheelers is " + numberOf4Wheelers);
        int twoWheelers = v - numberOf4Wheelers;
        System.out.println("Total 2 wheeler is " + twoWheelers);

    }
}
