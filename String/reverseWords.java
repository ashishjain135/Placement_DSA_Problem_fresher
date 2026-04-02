
public class reverseWords {

    public static void main(String[] args) {
        String s = "  the sky   is blue  ";

        String[] words = s.trim().split("\\s+"); // multiple spaces handle
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}
