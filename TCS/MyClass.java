
import java.util.*;

public class MyClass {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n < 0) {
            System.out.println("error");
            return;
        }
        if (n <= 2) {
            System.out.println(n * 100);
        } else if (n <= 5) {
            int twomonth = 2 * 100;
            int remain = (n - 2) * 50;
            System.out.println(twomonth + remain);

        } else if (n > 5) {
            int twomonth = 2 * 100;
            int aftertwo = 3 * 50;
            int remain = (n - 5) * 20;
            System.out.println(twomonth + aftertwo + remain);
        }
    }
}
