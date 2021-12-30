//Submit here: https://dmoj.ca/problem/ccc13j3

package J2013;
import java.util.*;

public class ccc2013j3s1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        input.close();
        
        year++;

        while(true) {

            String yearValue = Integer.toString(year);
            boolean multiples = true;

            for(int i = 0; i < yearValue.length(); i++) {
                String tempString = yearValue.substring(i, i+1);
                for(int k = 0; k < yearValue.length(); k++) {

                    if(i == k) {
                        continue;
                    } else if(tempString.equals(yearValue.substring(k, k+1))) {
                        multiples = false;
                    }
                }
            }

            if(multiples) {
                System.out.println(year);
                break;
            } else {
                year++;
            }
        }

    }    
}
