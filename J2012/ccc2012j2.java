//Submit here: https://dmoj.ca/problem/ccc12j2

package J2012;
import java.util.*;

public class ccc2012j2 {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        int[] levels = new int[4];

        for(int i = 0; i < 4; i++) {
            levels[i] = input.nextInt();
        } 

        input.close();

        int[] difference = new int[3];
        for(int i = 0; i < 3; i++) {
            difference[i] = levels[i] - levels[i+1];
        }

        int countRise = 0;
        int countFall = 0;
        int countConstant = 0;

        for(int i = 0; i < 3; i++) {
            if(difference[i] < 0) {
                countRise++;
            } else if(difference[i] > 0) {
                countFall++;
            } else if(difference[i] == 0) {
                countConstant++;
            }
        }

        if(countRise == 3) {
            System.out.println("Fish Rising");
        } else if(countFall == 3) {
            System.out.println("Fish Diving");
        } else if(countConstant == 3) {
            System.out.println("Fish At Constant Depth");
        } else {
            System.out.println("No Fish");
        }
    }
}
