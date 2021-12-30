//Submit here: https://dmoj.ca/problem/ccc13j2

package J2013;
import java.util.*;

public class ccc2013j2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        input.close();

        String[] rotate = new String[]{"I", "O", "S", "H", "Z", "X", "N"};

        boolean works = true;

        for(int i = 0; i < word.length(); i++) {
            
            String tempString = word.substring(i,i+1);
            int count = 0;

            for(int k = 0; k < 7; k++) {

                if(tempString.equals(rotate[k])) {
                    count++;
                }
            }

            if(count != 1) {
                works = false;
            }
        }

        if(works) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
