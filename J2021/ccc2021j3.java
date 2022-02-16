//Submit here: https://dmoj.ca/problem/ccc21j3

package J2021;
import java.util.*;

public class ccc2021j3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> directions = new ArrayList<String>();

        while(true) {

            String line = input.nextLine();

            int num = Integer.parseInt(line);

            if(num == 99999) {
                break;
            }

            directions.add(line);
        }

        input.close();

        String savedCompass = "";
        
        for(int i = 0; i < directions.size(); i++) {
            String compass = "";

            int direction = Integer.parseInt(directions.get(i).substring(0, 1)) + Integer.parseInt(directions.get(i).substring(1, 2));
            if(direction == 0) {
                compass = savedCompass;
            } else if(direction % 2 == 0) {
                compass = "right";
                savedCompass = compass;
            } else if(direction % 2 == 1) {
                compass = "left";
                savedCompass = compass;
            }

            int steps = Integer.parseInt(directions.get(i).substring(2, 5));
            System.out.println(compass + " " + steps);
        }
        
    }
}
