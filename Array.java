/*
 * Given an array, "A", of "N" integers, print 
 * each element in reverse order as a single 
 * line of space-separated integers.
 **/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Array {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N");
        int n = in.nextInt();
        
       System.out.print("Enter Nth elemnt of Array: ");
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        
         for(int i=arr.length-1 ; i >= 0 ; i--)
         {  
             System.out.print(arr[i]+" ");
            
            }        
        
        
    }
}
