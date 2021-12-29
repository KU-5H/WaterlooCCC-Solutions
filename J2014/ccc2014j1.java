//Submit here: https://dmoj.ca/problem/ccc14j1

package J2014;
import java.util.*;

public class ccc2014j1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();

        input.close();

        int sum = angle1 + angle2 + angle3;

        if(sum != 180) {
            System.out.println("Error");
        } else if(angle1 == angle2 && angle1 == angle3) {
            System.out.println("Equilateral");
        } else if((angle1 == angle2 && angle1 != angle3) || (angle2 != angle1 && angle2 == angle3) || (angle1 == angle3 && angle1 != angle2)) {
            System.out.println("Isosceles");
        } else if(angle1 != angle2 && angle2 != angle3 && angle1 != angle3) {
            System.out.println("Scalene");
        }
    }
}
