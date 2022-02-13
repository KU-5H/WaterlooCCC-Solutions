//Submit here: https://dmoj.ca/problem/ccc21j1

package J2021;
import java.util.*;

public class ccc2021j1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int B = input.nextInt();

        input.close();

        int P = 5*B - 400;
        int seaLevel = 0;

        if(P < 100) {
            seaLevel = 1;
        } else if(P > 100) {
            seaLevel = -1;
        } else if(P == 100) {
            seaLevel = 0;
        }

        System.out.println(P);
        System.out.println(seaLevel);
    }
}
