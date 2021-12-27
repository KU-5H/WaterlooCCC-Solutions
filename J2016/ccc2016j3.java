//Submit here: https://dmoj.ca/problem/ccc16j1

package J2016;
import java.util.*;

public class ccc2016j3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        input.close();

        word += " ";

        int length = 0;
        int count = 1;

        for(int i = 0; i < word.length()-1; i++) {

            for(int k = 0; k <= word.length() - 1 - count; k++) {
                String tempString = word.substring(k, k+count);
                if(checkPalindrome(tempString)) {
                length = tempString.length();
                }

            }
            count++;
        }
        System.out.println(length);
    }

    public static boolean checkPalindrome(String text) {

        int startLetter = 0;
        int endLetter = text.length()-1;

        while(startLetter < endLetter) {
            if(text.charAt(startLetter) != text.charAt(endLetter)) {
                return false;
            }
            startLetter++;
            endLetter--;
        }
        return true;
    }
}
