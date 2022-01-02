//Submit here: https://dmoj.ca/problem/ccc09j2

package J2009;
import java.util.*;

public class ccc2009j2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int troutPoints = input.nextInt();
        int pikePoints = input.nextInt();
        int pickerelPoints = input.nextInt();
        int pointCap = input.nextInt();
        input.close();

        int troutCount = 0; 
        int options = 0;

        while(true) {

            int troutAmount = troutCount*troutPoints;
            int pikeCount = 0;
            boolean troutCheck = false;

            while(true) {

                int pikeAmount = pikeCount*pikePoints;
                int pickCount = 0;
                boolean pikeCheck = false;
                
                while(true) {

                    int pickAmount = pickCount*pickerelPoints;

                    int totalPoints = troutAmount + pikeAmount + pickAmount;

                    if(totalPoints != 0) {
                        if(totalPoints <= pointCap) {
                            System.out.println(troutCount + " Brown Trout, " + pikeCount + " Northern Pike, " + pickCount + " Yellow Pickerel");
                            pickCount++;
                            options++;
                        } else {
                            if(pikeCount == 0 && pickCount == 0 && troutCount != 0) {
                                troutCheck = true;
                            } else if(pickCount == 0 && pikeCount != 0) {
                                pikeCheck = true;
                            }
    
                            break;
                        }
                    } else {
                        pickCount++;
                    }

                }
                if(pikeCheck) {
                    break;
                } else {
                    pikeCount++;
                }
            }

            if(troutCheck) {
                break;
            } else {
                troutCount++;
            }
        }

        System.out.println("Number of ways to catch fish: " + options);
    }
    
}
