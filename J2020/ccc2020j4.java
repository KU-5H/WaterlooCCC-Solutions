//Submit here: https://dmoj.ca/problem/ccc20j4

package J2020;
import java.util.*;

public class ccc2020j4 {
    public static void main(String[] args)
    {
        //New Scanner
        Scanner input = new Scanner(System.in);
        
        //Two String values to get the string values
        String mes = input.nextLine();
        String message = input.nextLine();
        
        //Make a array to hold shifts
        String[] num = new String[message.length()];
        
        //Variable for shifts
        int shift = 0;
        
        //For loop to make all possible variations of check
        for(int k = 0; k < message.length(); k++) {
            
            //Tempory message to get substringvalues
            String tempMessage = "";
            
            //For loop to make variants
            for(int i = 0; i < message.length(); i++) {
                
                //Temp string to get the substring of i
                String tempString = message.substring(0, i);
                
                //Change letter depending on conditions
                if(tempString.length() == message.length()-1) {
                    tempMessage += message.charAt(i-(message.length()-1)); 
                } else {
                    tempMessage += message.charAt(i+1);
                }
            }
            
            //Assing value to array and changing original message
            num[k] = tempMessage;
            message = tempMessage;
            
        }
        
        //Checker to output correct details
        boolean contain = false;
        
        //For loop to check if any of the arrays are in the designated spot
        for(int i = 0; i <= mes.length() - message.length(); i++) {
            for(int k = 0; k < message.length(); k++) {
                if(mes.substring(i, (i + message.length())).equals(num[k])) {
                    contain = true;
                    break;
                }
            }
        }
        
        //Output the code depending on hte condition
        if (contain) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
    }
}
