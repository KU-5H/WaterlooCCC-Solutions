//Submit here: https://dmoj.ca/problem/ccc15j3

package J2015;
import java.util.*;

public class ccc2015j3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        input.close();

        String finalMessage = "";

        for(int i = 0; i < name.length(); i++) {
            char tempChar = name.charAt(i);
            int tempNum = (int)tempChar;

            if(tempNum != 97 && tempNum != 101 && tempNum != 105 && tempNum != 111 && tempNum != 117) {
                finalMessage += "" + tempChar + vowel(tempChar) + character(tempChar);
            } else {
                finalMessage += "" + tempChar;
            }
        }
        System.out.println(finalMessage);
    }

    public static char vowel(char letter) {

        char vowelLetter = ' ';

        char[] vowels = new char[]{97,101,105,111,117};
        int[] difference = new int[5];
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i < 5; i++) {
            difference[i] = Math.abs(letter -  vowels[i]);

            if(difference[i] == minimum) {
                vowelLetter = vowels[i-1];
            } else if (difference[i] < minimum) {
                vowelLetter = vowels[i];
                minimum = difference[i];
            }
        }
        return vowelLetter;
    }

    public static char character(char letter) {

        int consonantNum = letter + 1;
        char consonant = ' ';

        if(consonantNum == 97 || consonantNum == 101 || consonantNum == 105 || consonantNum == 111 || consonantNum == 117) {
            consonantNum++;
        }

        if(consonantNum > 122) {
            consonantNum = 122;
        }

        consonant = (char)consonantNum;

        return consonant;
    }
}
