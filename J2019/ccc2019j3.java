//Sumbit here: https://dmoj.ca/problem/ccc19j3

package J2019;
import java.util.*;

public class ccc2019j3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        String temp = input.nextLine();
        
        String[] symbol = new String[num];
        
        for(int i = 0; i < num; i++) {
            symbol[i] = input.nextLine();
        }
        
        for(int i = 0; i < symbol.length; i++) {

            String message = " ";
            char symbolVal = ' ';
            int count = 1;

            for(int k = 1; k < symbol[i].length(); k++) {
                if(symbol[i].charAt(k) == symbol[i].charAt(k-1)) {
                    count++;
                } else {
                    symbolVal = symbol[i].charAt(k-1);

                    message += count + " " + symbolVal + " ";

                    count = 1;
                    symbolVal = ' ';

                }

                if(k == symbol[i].length()-1) {
                    symbolVal = symbol[i].charAt(k);

                    message += count + " " + symbolVal + " ";
                }

            }

            System.out.println(message);
            
        }
    }    
}
