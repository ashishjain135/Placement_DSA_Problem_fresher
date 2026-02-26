public class numberReduce {
    public static int numSteps(String s) {
        // int decimal = Integer.parseInt(s, 2);
        // int decimal = 0;
        // for(int i = 0; i<s.length(); i++){
        //     decimal = decimal * 2 + (s.charAt(i) - '0');
        // }
        // int count = 0;
        // System.out.println(decimal);
        // while(decimal > 1){
        //     if(decimal % 2 != 0){
        //         decimal =  decimal + 1;
        //     }else{
        //         decimal  = decimal / 2;
        //     }
        //     count++;
        // }
        // return count;


        int count = 0;
        int carry = 0;
        for(int i = s.length() -1; i>0; i--){
            int bit = s.charAt(i) - '0' + carry;
            if(bit == 1){
                count += 2;
                carry = 1; 
            }else{
                count += 1;
            }
        }
        return count+ carry;

    }
    public static void main(String[]args){
        String s = "1111011110000011100000110001011011110010111001010111110001";
        System.out.println(numSteps(s));
    }
}
