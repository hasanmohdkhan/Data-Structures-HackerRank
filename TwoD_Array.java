/**
 * Write a description of class TwoD_Array here.
 * 2 4 4
     2       <== hourglass is here
   1 2 4
 * 
 * Calculate the hourglass sum for every hourglass in 2D Matrix,
 * then print the maximum hourglass sum.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoD_Array{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sum;
        List<Integer> list=new ArrayList<Integer>();
        System.out.println("Enter Values :");
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
    
        // here i,j value is 5 i.e 4 (index from 0 to 4)
        // last index 5 not consider as it causes Exception :(
        for(int i=0 ; i < 4 ; i++){
        
        for(int j=0 ; j < 4 ; j++){
         
          sum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
         list.add(sum);
         System.out.print("Arr["+i+"]["+j+"] : ");   
         System.out.println(sum);
         
        
        }
       }   
    
       System.out.println("Max Value: " +Collections.max(list));
    }
  }
