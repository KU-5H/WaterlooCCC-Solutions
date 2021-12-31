//Submit here: https://dmoj.ca/problem/ccc13j2

package J2012;
import java.util.*;

public class ccc2012j3 {
    public static void main (String[] args) {
        
        Scanner input = new Scanner(System.in);
        int expansions = input.nextInt();
        input.close();

        String[] line = new String[3];
        line[0] = "*x*";
        line[1] = " xx";
        line[2] = "* *";

        String[] computer = new String[3];

        for(int j = 0; j < 3; j++) {
            for(int i = 0; i < line[j].length(); i++) {
                String tempString = line[j].substring(i,i+1);
    
                for(int k = 0; k < expansions; k++) {
                    if(computer[j] == null) {
                        computer[j] = tempString;
                    } else {
                        computer[j] += tempString;
                    }
                }
    
            }
        }

        for(int i = 0; i < 3; i++) {
            for(int k = 0; k < expansions; k++) {
                System.out.println(computer[i]);
            }
        }
    }  
}
