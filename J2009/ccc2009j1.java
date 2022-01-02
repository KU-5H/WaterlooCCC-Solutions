//Submit here: https://dmoj.ca/problem/ccc09j1

package J2009;
import java.util.*;

public class ccc2009j1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        input.close();

        int sum = 9*1 + 7*3  + 8*1  + 0*3 + 9*1 + 2*3 + 1*1 + 4*3 + 1*1 + 8*3;
        sum += num1*1 + num2*3 + num3*1;

        System.out.println("The 1-3-sum is " + sum);
    }
    
}
