/**
 * Jack is always excited about sunday. It is favourite day, when he gets to play all day. And goes to cycling with his friends.  
 * So every time when the months starts he counts the number of sundays he will get to enjoy. Considering 
 * the month can start with any day, be it Sunday, Monday…. Or so on. 
 * Count the number of Sunday jack will get within n number of days. 
 * Example 1: 
 * Input  mon-> input String denoting the start of the month. 
 * 13  -> input integer denoting the number of days from the start of the month. 
 * Output : 
 * 2    -> number of days within 13 days. 
 * Explanation: 
The month start with mon(Monday). So the upcoming sunday will arrive in next 6 days. And then next 
Sunday in next 7 days and so on. 
Now total number of days are 13. It means 6 days to first sunday and then remaining 7 days will end up 
in another sunday. Total 2 sundays may fall within 13 days. 

Week is always: 
Sun 
Mon 
Tue 
Wed 
Thu 
Fri 
Sat 
Then again Sun 
So after every 7 days → Sunday comes again.
 * 
 */
import java.util.*;

public class JackplaySunday{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day =sc.next();
        int n = sc.nextInt();

        int start = 0;
        // if(day.equals("Sun")) start = 0;
        if(day.equals("Mon")) start = 1;
        else if(day.equals("Tue")) start = 2;
        else if(day.equals("Wed")) start = 3;
        else if(day.equals("Thu")) start = 4;
        else if(day.equals("Fri")) start = 5;
        else if(day.equals("Sat")) start = 6;

        // int count = 0;
        // for(int i = 0; i<n; i++){
        //     int today = (start + i) % 7 ;
        //     if(today == 0) count ++;
        // }
        int count = (start + n) / 7;

        System.out.println(count);
        sc.close();

    }
}