//Submit here: https://dmoj.ca/problem/ccc15j2

package J2015;
import java.util.*;

public class ccc2015j2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        input.close();

        int happyCount = 0;
        int sadCount = 0;

        for(int i = 0; i < message.length() - 3; i++) {
            String tempString = message.substring(i, i+3);

            if(tempString.equals(":-)")) {
                happyCount++;
            } else if(tempString.equals(":-(")) {
                sadCount++;
            }
        }

        if(happyCount == 0 && sadCount == 0) {
            System.out.println("none");
        } else if (happyCount > sadCount) {
            System.out.println("happy");
        } else if (sadCount > happyCount) {
            System.out.println("sad");
        } else if (happyCount == sadCount) {
            System.out.println("unsure");
        }
    }   
}
