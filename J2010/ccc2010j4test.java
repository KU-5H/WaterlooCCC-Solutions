//Dosen't work curerntly. Submit here: https://dmoj.ca/problem/ccc10j4

package J2010;
import java.util.*;

public class ccc2010j4test {
    public static void main(String[] args)
    {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Get message
        String message[] = input.nextLine().split(" ");
        
        //Test array and formatting for it
        int testArr[] = new int[message.length];
        for(int i = 0; i < message.length; i++) {
            testArr[i] = Integer.parseInt(message[i]);
        }
        
        //New array that hold everything after the first value
        int arr[] = new int[testArr[0]];
        for(int i = 1; i <= testArr[0]; i++) {
            arr[i-1] = testArr[i]; 
        }
        
        //Array to get the remainder values for the sequence
        int rem[] = new int[arr.length-1];
        for(int i = 0; i < testArr[0]-1; i++) {
            rem[i] = arr[i+1] - arr[i];
        }
        
        //loop and statements to ifnally check for value and post pattern value
        if(num == 0) {
            System.out.println(" ");
        } else if (num == 1) {
            System.out.println(" ");
        } else if (num > 1) {
            
            while(true) {
                
                //Variables and array used later on (one is for beginning value and other is for saving and last if the acutal counter)
                int num = testArr[0];
                int length = 1;
                boolean works = true;
                int check[] = new int[rem.length];
                
                //For loop to check for same instance of number to output pattern
                for(int i = 0; i < rem.length; i++) {
                    check[i] = rem[i % length];
                }
                
                //For loop to check numbers and change accordingly
                for(int i = 0; i < rem.length; i++) {
                    if(check[i] == rem[i]) {
                        continue;
                    } else {
                        works = false;
                        break;
                    }
                }
                
                //Output depending on situaton
                if(works) {
                    System.out.println(length);
                    break;
                } else {
                    length++;
                }
            }
        }
    }
}
