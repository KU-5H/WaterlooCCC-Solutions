package J2020;
import java.util.*;

public class testj1 {   
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.close();

        int s = input.nextInt();
        int m = input.nextInt();
        int l = input.nextInt();

        int happiness = 1*s + 2*m + 3*l;

        if(happiness >= 10) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }

    }

}
