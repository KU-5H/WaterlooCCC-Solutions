//Submit here: https://dmoj.ca/problem/ccc16j1

package J2016;
import java.util.*;

public class ccc2016j1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String[] fights = new String[6];

        int count = 0;

        for(int i = 0; i < 6; i++) {
            fights[i] = input.nextLine();
            if(fights[i].equals("W")) {
                count++;
            }
        }

        if(count < 1) {
            System.out.println(-1);
        } else if (count < 3) {
            System.out.println(3);
        } else if (count < 5) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }

        input.close();

    }
}
