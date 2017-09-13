import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    /**
     * You are given a list of size N,
     * initialized with zeroes. You have to perform M operations on the list 
     * and output the maximum of final values of all the N elements in the list.
     * For every operation, you are given three integers, a,b and k and you have to add value k 
     * to all the elements ranging from index a to b(both inclusive).
     * 
     */
public class AlgorithmicCrush
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter: ");
        // taking input i.e size of list
        int mArraySize = in.nextInt();
        //number of opertion to perform
        int mOperation = in.nextInt();
        // initialziation Arraylist
        long[] mArray = new long[mArraySize]; 
        System.out.println("ArrayList: " +mArray);
        
       while(mOperation-- > 0){
         // updating list
            int mStartIndex = in.nextInt();
            int mStopIndex  = in.nextInt();
            int mValueToBeAdd = in.nextInt();
            
            //updating list according to list 
            
            for(int i = mStartIndex - 1 ; i < mStopIndex   ; i++)
               {
                   mArray[i] += mValueToBeAdd;
                } 
           System.out.println("ArrayList Updated: " +mArray);
           
           }
           for(int i = 0 ; i < mArray.length ; i++)
               {
                   System.out.println("ArrayList Updated: " +mArray[i]);
                }
           
           
            Arrays.sort(mArray);
            long max = mArray[mArray.length-1];
            System.out.println("ArrayList Max: "+max);       
    }
}
