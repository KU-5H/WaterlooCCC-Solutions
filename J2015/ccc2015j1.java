//Submit here: https://dmoj.ca/problem/ccc15j1

package J2015;
import java.util.*;

public class ccc2015j1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int month = input.nextInt();
        int day = input.nextInt();

        if(month > 2) {
            System.out.println("After");
        } else if (month == 2) {
            if(day < 18) {
                System.out.println("Before");
            } else if (day > 18) {
                System.out.println("After");
            } else {
                System.out.println("Special");
            }
        } else if (month == 1) {
            System.out.println("Before");
        }

        input.close();

    }

}
