//Submit here: https://dmoj.ca/problem/ccc21j2

package J2021;
import java.util.*;

public class ccc2021j2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int people = input.nextInt();
        input.nextLine();

        String[] names = new String[people];
        int[] bets = new int[people];

        for(int i = 0; i < people; i++) {
            names[i] = input.nextLine();
            bets[i] = input.nextInt();
            input.nextLine();
        }

        input.close();

        int max = Integer.MIN_VALUE;
        String winner = "";

        for(int i = 0; i < people; i++) {
            if(bets[i] > max) {
                winner = names[i];
                max = bets[i];
            }
        }

        System.out.println(winner);
        
    }
}
