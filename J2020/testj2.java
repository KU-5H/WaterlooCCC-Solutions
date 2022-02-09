package J2020;
import java.util.*;

public class testj2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int breakValue = input.nextInt();
        int start = input.nextInt();
        int infectCap = input.nextInt();

        int count = 0;
        int infectCount = 0;

        while(true) {

            int infect = start*infectCap;
            infectCount += infect;

            if(infectCount >= breakValue) {
                count++;
                System.out.println(count);
                break;
            } else {
                start = infect;
                count++;
            }

        }



    }
    
}
