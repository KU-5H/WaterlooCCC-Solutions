//Submit here: https://dmoj.ca/problem/ccc20j3

package J2020;
import java.util.*;

public class ccc2020j3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int numOfRuns = input.nextInt();
        String space = input.nextLine();
        String[] comma = new String[numOfRuns];
        
        for(int i = 0; i < numOfRuns; i++) {
            comma[i] = input.nextLine();
        }
        
        int[] num1 = new int[numOfRuns];
        int[] num2 = new int[numOfRuns];
        
        
        for(int i = 0; i < numOfRuns; i++) {
            String temp[] = comma[i].split(",");
            num1[i] = Integer.parseInt(temp[0]);
            num2[i] = Integer.parseInt(temp[1]);
        }
        
        Arrays.sort(num1);
        Arrays.sort(num2);
        
        int num1min = num1[0] - 1;
        int num2min = num2[0] - 1;
        int num1max = num1[num1.length-1] + 1;
        int num2max = num2[num2.length-1] + 1;
        
        System.out.println(num1min + "," + num2min);
        System.out.println(num1max + "," + num2max);
    }
}
