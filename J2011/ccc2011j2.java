//Submit here: https://dmoj.ca/problem/ccc11j1

package J2011;
import java.util.*;

public class ccc2011j2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int M = input.nextInt();
        input.close();

        boolean key = true;

        for(int t = 1; t <= M; t++) {
            double A = (-6*Math.pow(t, 4)) + (h*Math.pow(t, 3))+ (2*Math.pow(t, 2)) + t;

            if(A <= 0) {
                System.out.println("The balloon first touches ground at hour: ");
                System.out.println(t);
                key = false;
                break;
            }

        }

        if(key) {
            System.out.println("The balloon does not touch ground in the given time.");
        }
    }
    
}
