//Submit here: https://dmoj.ca/problem/ccc18j2

package J2018;
import java.util.*;

public class ccc2018j2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int parkSpace = input.nextInt();
        String deleteExtra = input.nextLine();
        
        String day1 = input.nextLine();
        String day2 = input.nextLine();
        
        int count = 0;
        
        for(int i = 0; i < parkSpace; i++) {
            
            if(day1.charAt(i) == 'C' && day2.charAt(i) == 'C') {
                count++;
            }
        }        
        
        System.out.println(count);
        input.close();
    }
}
