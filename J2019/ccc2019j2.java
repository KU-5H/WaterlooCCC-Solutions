//Submit here: https://dmoj.ca/problem/ccc19j2

package J2019;
import java.util.*;

public class ccc2019j2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        String temp = input.nextLine();
        
        String[] symbol = new String[num];
        int[] numS = new int[num];
        
        for(int i = 0; i < num; i++) {
            numS[i] = input.nextInt();
            symbol[i] = input.nextLine();
        }
        
        for(int i = 0; i < symbol.length; i++) {
            String message = "";
            
            for(int k = 0; k < numS[i]; k++) {
                message += symbol[i].charAt(1);
            }
            System.out.println(message);
            
        }
        
    }
}
