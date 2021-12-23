//Submit here: https://dmoj.ca/problem/ccc17j3

package J2017;
import java.util.*;

public class ccc2017j3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int spot1x = input.nextInt();
        int spot1y = input.nextInt();

        int spot2x = input.nextInt();
        int spot2y = input.nextInt();

        int spots = input.nextInt();

        input.close();

        int sumx = Math.abs(spot1x - spot2x);
        int sumy = Math.abs(spot1y - spot2y);

        int sum = sumx + sumy;

        if(spots % 2 == sum % 2 && spots >= sum) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

    }
    
}
