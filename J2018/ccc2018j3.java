//Submit here: https://dmoj.ca/problem/ccc18j3

package J2018;
import java.util.*;

public class ccc2018j3 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int[] arr = new int[5];
        arr[0] = 0;
        
        for(int i = 1; i < 5; i++) {
            arr[i] = input.nextInt();
        } 
        
        int[][] grid = new int[5][5];
        
        for(int i = 0; i < 5; i++) {
            
            int sum = 0;
            
            for(int k = 0; k < 5; k++) {
                
                if(i == 0) {
                    sum += arr[k];
                    grid[i][k] = sum;
                    System.out.print(grid[i][k] + " ");
                } else {
                    sum = grid[0][i];
                    
                    if(grid[0][k] < sum) {
                        sum -= grid[0][k];
                    } else {
                        sum = grid[0][k] - sum;
                    }
                    
                    grid[i][k] = sum;
                    System.out.print(grid[i][k] + " ");
                }
                
            }
            System.out.println();
        }
        
        input.close();
        
    }
}
