//Submit here: https://dmoj.ca/problem/ccc13j1

package J2013;
import java.util.*;

public class ccc2013j1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int young = input.nextInt();
        int middle = input.nextInt();

        input.close();

        int ageDifference = middle - young;
        int old = middle + ageDifference;

        System.out.println(old);
    }
    
}
