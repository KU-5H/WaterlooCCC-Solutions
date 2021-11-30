//Submit here: https://dmoj.ca/problem/ccc19j1

package J2019;
import java.util.*;

public class ccc2019j1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        int num6 = input.nextInt();
        
        int sum1 = (3*num1) + (2*num2) + (num3);
        int sum2 = (3*num4) + (2*num5) + (num6);
        
        if(sum1 > sum2) {
            System.out.println("A");
        } else if(sum2 > sum1){
            System.out.println("B");
        } else {
            System.out.println("T");
        }
    }
}