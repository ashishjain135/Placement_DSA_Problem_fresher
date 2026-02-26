/**
 * Binary to Decimal Converter
 * This program converts a binary number to its decimal equivalent.
 * The user is prompted to enter a binary number, and the program validates the input to ensure
 * 
 * input : 1011
 * output: 11
 */


public class binaryToDecimal {
    public static void main(String[]args){
        String binary = "1010";
        int decimal = Integer.parseInt(binary,2);
        System.out.println("Binary number: " + binary);
        System.out.println("Decimal equivalent: " + decimal);


    }
}
