//Submit here: https://dmoj.ca/problem/ccc09j3

package J2009;
import java.util.*;

public class ccc2009j3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        input.close();

        String[] cities = new String[]{"Ottawa", "Victoria", "Edmonton", "Winnipeg", "Toronto", "Halifax", "St. John's"};
        int[] times = new int[7];

        times[0] = time; 
        times[1] = time - 300;
        times[2] = time - 200;
        times[3] = time - 100;
        times[4] = time;
        times[5] = time + 100; 
        times[6] = time + 130;
        
        String lastCity = Integer.toString(times[5]);
        String lastCity2 = Integer.toString(times[6]);
        int lastNumString = Integer.valueOf(lastCity.substring(lastCity.length()-2, lastCity.length()));
        int difference = times[6] - lastNumString;

        int sixIndex = Integer.valueOf(lastCity2.substring(lastCity2.length()-2, lastCity2.length()));

        if(sixIndex >= 60) {
            if(difference >= 60) {
                times[6] -= 60;
                times[6] += 100;
            }
        }

        for(int i = 0; i < 7; i++) {

            if(times[i] >= 2400) {
                times[i] -= 2400;
            }

            if(times[i] < 0) {
                times[i] = 2400 + times[i];
            }

            System.out.println(times[i] + " in " + cities[i]);
        }
    }
    
}
