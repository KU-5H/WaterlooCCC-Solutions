//Submit here: https://dmoj.ca/problem/ccc11j1

package J2011;
import java.util.*;

public class ccc2011j3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        input.close();

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(num1);
        numbers.add(num2);
        int count = 0;
        int sequence = 2;


        while(true) {

            int difference = numbers.get(count) - numbers.get(count+1);

            if(difference >= 0) {
                numbers.add(difference);
                count++;
                sequence++;
            } else {
                break;
            }
        }

        System.out.println(sequence);

        
    }
    
}
