//Sumbmit here: https://dmoj.ca/problem/ccc19j4

package J2019;
import java.util.*;

public class ccc2019j4test {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int nLine = input.nextInt();
        int mLine = input.nextInt();

        int[] nLine1 = new int[nLine];
        int[] nLine2 = new int[nLine];

        int[] mLines1 = new int[mLine];
        int[] mLines2 = new int[mLine];

        for(int i = 0; i < nLine; i++) {
            nLine1[i] = input.nextInt();
            nLine2[i] = input.nextInt();
        }

        for(int i = 0; i < mLine; i++) {
            mLines1[i] = input.nextInt();
            mLines2[i] = input.nextInt();
        }
        input.close();

        int maxScore = Integer.MIN_VALUE;
        int beauty = 0;

        for(int i = 0; i < nLine; i++) {

            for(int j = 0; j < nLine; j++) {

                for(int k = 0; k < nLine; k++) {

                    int tempMax = Integer.MIN_VALUE;
                    boolean key = true;

                    if(j != i && k != i && j != k) {

                        for(int l = 0; l < mLine; l++) {

                            if((i == mLines1[l]-1 && j == mLines2[l]-1) || (i == mLines1[l]-1 && k == mLines2[l]-1) || (j == mLines1[l]-1 && i == mLines2[l]-1) || (j == mLines1[l]-1 && k == mLines2[l]-1) || (k == mLines1[l]-1 && i == mLines2[l]-1) || (k == mLines1[l]-1 && j == mLines2[l]-1)) {
                                key = false;
                                break;
                            }
                        }

                        if(key) {
                            tempMax = beauty*nLine1[i] + nLine2[i];
                            tempMax = tempMax*nLine1[j] + nLine2[j];
                            tempMax = tempMax*nLine1[k] + nLine2[k];
                        }                        
                    }

                    if(tempMax > maxScore) {
                        maxScore = tempMax;
                    }
                }
            }
        }

        if(maxScore == Integer.MIN_VALUE) {
            
            for(int i = 0; i < nLine; i++) {

                for(int k = 0; k < nLine; k++) {
                    int tempMax = Integer.MIN_VALUE;
                    boolean key = true;

                    if(k != i) {

                        for(int l = 0; l < mLine; l++) {

                            if((i == mLines1[l]-1 && k == mLines2[l]-1) || (k == mLines1[l]-1 && i == mLines2[l]-1)) {
                                key = false;
                                break;
                            }
                        }

                        if(key) {
                            tempMax = beauty*nLine1[i] + nLine2[i];
                            tempMax = tempMax*nLine1[k] + nLine2[k];
                        }                        
                    }

                    if(tempMax > maxScore) {
                        maxScore = tempMax;
                    }
                }
            }
        }

        if(maxScore == Integer.MIN_VALUE) {

            for(int i = 0; i < nLine; i++) {

                int tempMax = Integer.MIN_VALUE;
                tempMax = beauty*nLine1[i]+nLine2[i];

                if(tempMax > maxScore) {
                    maxScore = tempMax;
                }
            }
        }

        System.out.println(maxScore);

    }
}
