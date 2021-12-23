//Submit here: https://dmoj.ca/problem/ccc17j1

package J2017;
import java.util.*;

public class ccc2017j1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 > 0 && num2 > 0) {
            System.out.println("1");
        } else if(num1 < 0 && num2 > 0) {
            System.out.println("2");
        } else if(num1 < 0 && num2 < 0) {
            System.out.println("3");
        } else if(num1 > 0 && num2 < 0) {
            System.out.println("4");
        }

        input.close();
    }
}
