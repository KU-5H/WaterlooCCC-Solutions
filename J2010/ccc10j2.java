//Submit here: https://dmoj.ca/problem/ccc10j2

package J2010;
import java.util.Scanner;

public class ccc10j2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int s = input.nextInt();
        
        int cycle1 = s/(a+b);
        int cycle2 = s/(c+d);
        
        final int aa = a;
        final int bb = b;
        final int cc = c;
        final int dd = d;
        final int ss = s;
        
        
        a *= cycle1;
        b *= cycle1;
        c *= cycle2;
        d *= cycle2;
        
        int left1 = s - (a+b);
        int left2 = s - (c+d);
        
        if(left1 != 0) {
            
            if(left1 <= aa) {
                a += left1;
            } else if (left1 > aa) {
                a += a;
                b += (left1 - b);
                
            }
        }    
        
        if(left2 != 0) {
            
            if(left2 <= cc) {
                c += left2;
            } else if (left2 > cc) {
                a += c;
                d += (left2 - c);
            }
        }
        
        int ans1 = a-b;
        int ans2 = c-d;
        
        if(ans1 > ans2) {
            System.out.println("Nikky");
        } else if (ans2 > ans1) {
            System.out.println("Byron");
        } else if (ans2 == ans1) {
            System.out.println("Tied");
        } else {
            System.out.println("");
        }
        
    }
}