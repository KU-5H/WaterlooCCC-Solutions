//Submit here: https://dmoj.ca/problem/ccc13j2

package J2012;
import java.util.*;

public class ccc2012j1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int limit = input.nextInt();
        int speed = input.nextInt();
        input.close();

        int amount = 0;
        boolean speeding = true;
        int speedingLevel = speed - limit;

        if(speed <= limit) {
            speeding = false;
        } else {
            if(speedingLevel >= 1 && speedingLevel <= 20) {
                amount = 100;
            } else if(speedingLevel >= 21 && speedingLevel <= 30) {
                amount = 270;
            } else if(speedingLevel >= 31) {
                amount = 500;
            }
        }

        if(speeding) {
            System.out.println("You are speeding and your fine is $" + amount + ".");
        } else {
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}