/**
 * Problem :- Frequency of Character in String
 * 
 * Given a string, print the frequency of each character in sorted order.

Input
programming
Output
a 1
g 2
i 1
m 2
n 1
o 1
p 1
r 2
 * 
 * 
 */
import java.util.*;
public class freqOfCharacterInString {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        int n = s.length();
        Map<Character, Integer>map = new HashMap<>();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        // Collections.sort(map, (a,b) -> Integer.compare(map.get(a), map.get(b)));
        // System.out.println(map);

        //sort based on character
        //copy map key in list then perform sorting opration on list
        List<Character>list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for(char ch : list){
            System.out.println(ch + " "+ map.get(ch));
        }


    }
}
