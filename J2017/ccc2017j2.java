//Submit here: https://dmoj.ca/problem/ccc17j2

package J2017;
import java.util.*;

public class ccc2017j2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int[] arr = new int[num2 + 1];
        arr[0] = num1;

        for(int i = 1; i < num2+1; i++) {
            arr[i] = arr[i-1]*10;
        }

        int sum = 0;

        for(int i = 0; i < num2+1; i++) {
            sum += arr[i];
        }
 
        System.out.println(sum);

        input.close();

    }
}
