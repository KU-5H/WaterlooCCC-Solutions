//Submit here: https://dmoj.ca/problem/ccc11j1

package J2011;
import java.util.*;

public class ccc2011j1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int antenna = input.nextInt();
        int eyes = input.nextInt();
        input.close();


        if(antenna >= 3 && eyes <= 4) {
            System.out.println("TroyMartian");
        }

        if(antenna <= 6 && eyes >= 2) {
            System.out.println("VladSaturnian");
        }
        
        if(antenna <= 2 && eyes <=3) {
            System.out.println("GraemeMercurian");
        }
    }
}
