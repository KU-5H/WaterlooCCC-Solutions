//Submit here: https://dmoj.ca/problem/ccc14j3

package J2014;
import java.util.*;

public class ccc2014j3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numRounds = input.nextInt();

        int[] Antonia = new int[numRounds];
        int[] David = new int[numRounds];

        int pointsAnt = 100;
        int pointsDav = 100;

        for(int i = 0; i < numRounds; i++) {
            Antonia[i] = input.nextInt();
            David[i] = input.nextInt();

            if(Antonia[i] > David[i]) {
                pointsDav -= Antonia[i];
            } else if(Antonia[i] < David[i]) {
                pointsAnt -= David[i];
            }
        }

        input.close();

        System.out.println(pointsAnt);
        System.out.println(pointsDav);
    }
    
}
