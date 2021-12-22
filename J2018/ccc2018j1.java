//Submit here: https://dmoj.ca/problem/ccc18j1

package J2018;
import java.util.*;

public class ccc2018j1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
        String number = "";
        
        for(int i = 0; i < 4; i++) {
            number += input.nextLine();
        }
        
        if((number.charAt(0) == '9' || number.charAt(0) == '8') && (number.charAt(3) == '9' || number.charAt(3) == '8') && number.charAt(1) == number.charAt(2)) {
            System.out.println("ignore");
        } else {
            System.out.println("answer");
        }
        
        input.close();
        
    }
    
}
