import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/** 
 * do left rotation in array
 * 
 */
public class LeftRotation{
      public static void main(String[] args) 
       {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter: ");
         int n = in.nextInt();  // Array size
         int r = in.nextInt(); // no. of left rotation to do
         int[] arr = new int[n];
           for(int i = 0; i < n ; i++)
         {
            arr[(i+n-r)%n]=in.nextInt();   
            // swifting array at input time 
         }
         
           for(int i = 0; i < n ; i++)
         {
            System.out.print(arr[i]+" ");   
         }
         }  
       }