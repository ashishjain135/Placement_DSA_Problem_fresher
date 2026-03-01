/**
 * This program converts a decimal number to its hexadecimal representation.
 */

public class deciToHexa {
    public static void main(String[]args){
        int decimal = 26;
        // String hex = Integer.toHexString(decimal);
        // System.out.println("Decimal: " + decimal);
        // System.out.println("Hexadecimal: " + hex.toUpperCase());

        String hex = "";
        int temp = decimal;
        while(temp > 0){
            int remainder = temp % 16;
            if(remainder < 10){
                hex = remainder + hex;
            } else {
                hex = (char)('A' + remainder - 10) + hex;
            }
            temp /= 16;
        }
        System.out.println("Decimal: " + decimal);
        System.out.println("Hexadecimal: " + hex.toUpperCase());
    }
}
