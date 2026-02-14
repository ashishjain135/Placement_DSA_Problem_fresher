/**
 * Print a Special Pyramid from an Input Array
 * Problem : Given a height h and and input array arr, print a special pyramid where numbers less than 5 must be padded with zeros.
 * 
 * Test Case
 * Input: height = 3,
 * arr[] = [6, 28, 66, 120, 190, 276]
 * 
 * Output 
 * 00006
 * 00028 00066
 * 00120 00190 00276
 */
public class SpecialPyramid {
    public static void main(String[]args){
        int arr[] = {6, 28, 66, 120, 190, 276};
        int height = 3;
        int index = 0;
        for(int i = 1; i<=height; i++){
            for(int j = 1; j<=i; j++){
                System.out.printf("%05d ", arr[index]);
                index++;
            }
            System.out.println(" ");
        }
    }
}
