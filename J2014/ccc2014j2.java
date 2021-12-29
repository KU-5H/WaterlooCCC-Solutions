//Submit here: https://dmoj.ca/problem/ccc14j2

package J2014;
import java.util.*;

public class ccc2014j2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        String temp = input.nextLine();
        String letters = input.nextLine();
        input.close();
        
        int counta = 0;
        int countb = 0;

        for(int i = 0; i < length; i++) {
            char tempChar = letters.charAt(i);

            if(tempChar == 'A') {
                counta++;
            } else {
                countb++;
            }
        }

        if(counta > countb) {
            System.out.println("A");
        } else if(counta < countb) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }
}
