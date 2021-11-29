//Submit here: https://dmoj.ca/problem/ccc20j1

package J2020;
import java.util.*;

public class ccc2020j1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int s = input.nextInt();
        int m = input.nextInt();
        int l = input.nextInt();
        
        int ans = (1*s) + (2*m) + (3*l);
        
        if(ans >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
    }
    
}
