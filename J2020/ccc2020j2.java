//Submit here: https://dmoj.ca/problem/ccc20j2

package J2020;
import java.util.*;

public class ccc2020j2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int p = input.nextInt();
        int n = input.nextInt();
        int r = input.nextInt();
        
        int sum = 0;
        int g = 0;
        int count = 1;
         
        while(true) {
            
            if(g == 0) {
                g = n;
                sum += g;
            }
            
            g *= r;
            sum += g;
            
            if(sum > p) {
                System.out.println(count);
                break;
            }
            
            count++;
        }
    } 
}
