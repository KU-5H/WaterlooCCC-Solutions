//Submit here: https://dmoj.ca/problem/ccc10j3

package J2010;
import java.util.*;

public class ccc2010j3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int x = 0;
        int y = 0;
        
        char letter = ' ';
        char letter2 = ' ';
        int num2 = 0;
        
        boolean check = true;
        
        while(check) {
            
            
            String message = input.nextLine();
            
            int num = message.charAt(0);
            if(message.length()-1 > 0) {
                letter = message.charAt(2);
            }
            
            if(message.length()-1 > 2) {
                if(message.charAt(4) == 'A' || message.charAt(4) == 'B') {
                    letter2 = message.charAt(4);
                } else {
                    String num2Message = message.substring(4, message.length());
                    num2 = Integer.valueOf(num2Message);
                }    
            }
            
            if(num == 49) {
                
                if(letter == 'A') {
                    x = num2;
                } else if (letter == 'B') {
                    y = num2;
                }
                
            } else if(num == 50) {
                
                if(letter == 'A') {
                    System.out.println(x);
                } else if (letter == 'B') {
                    System.out.println(y);
                }
                
            } else if(num == 51) {
                
                if(letter == 'A' && letter2 == 'B') {
                    x += y;
                } else if (letter == 'A' && letter2 == 'A') {
                    x += x;
                } else if (letter == 'B' && letter2 == 'B') {
                    y += y;
                } else if (letter == 'B' && letter2 == 'A') {
                    y += x;
                }
                
            } else if(num == 52) {
                
                if(letter == 'A' && letter2 == 'B') {
                    x *= y;
                } else if (letter == 'A' && letter2 == 'A') {
                    x *= x;
                } else if (letter == 'B' && letter2 == 'B') {
                    y *= y;
                } else if (letter == 'B' && letter2 == 'A') {
                    y *= x;
                }
                
            } else if(num == 53) {
                
                if(letter == 'A' && letter2 == 'B') {
                    x -= y;
                } else if (letter == 'A' && letter2 == 'A') {
                    x -= x;
                } else if (letter == 'B' && letter2 == 'B') {
                    y -= y;
                } else if (letter == 'B' && letter2 == 'A') {
                    y -= x;
                }
                
            } else if(num == 54) {
                
                if(letter == 'A' && letter2 == 'B') {
                    x /= y;
                } else if (letter == 'A' && letter2 == 'A') {
                    x /= x;
                } else if (letter == 'B' && letter2 == 'B') {
                    y /= y;
                } else if (letter == 'B' && letter2 == 'A') {
                    y /= x;
                }
                
            } else if(num == 55) {
                check = false;
            }
            
        }
    }
}