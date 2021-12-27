//Submit here: https://dmoj.ca/problem/ccc16j2

package J2016;
import java.util.*;

public class ccc2016j2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] square = new int[4][4];

        for(int i = 0; i < 4; i++) {
            for(int k = 0; k < 4; k++) {
                square[i][k] = input.nextInt();
            }
        }

        int[] rowSum = new int[4];
        int[] colSum = new int[4];
        int[] sums = new int[8];


        for(int i = 0; i < 4; i++) {
            
            int rowCalc = 0;
            int colCalc = 0;

            for(int k = 0; k < 4; k++) {
                rowCalc += square[i][k];
                colCalc += square[k][i];
            }

            rowSum[i] = rowCalc;
            colSum[i] = colCalc;
        }

        for(int i = 0; i < 8; i++) {

            if(i > 3) {
                sums[i] = colSum[i-4];
            } else {
                sums[i] = rowSum[i];
            }
        }

        int equals = sums[0];
        boolean key = true;

        for(int i = 0; i < 8; i++) {
            if (equals != sums[i]) {
                System.out.println("not magic");
                key = false;
                break;
            }
        }

        if(key) {
            System.out.println("magic");
        }

        input.close();

    }
}
