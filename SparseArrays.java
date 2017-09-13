import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Write a description of class SparseArrays here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SparseArrays
{
   public static void main(String[] args) 
   {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter: ");
       int size = in.nextInt();
       
       ArrayList<String> mInputArrayList = new ArrayList<String>();
       ArrayList<String> mSearchArrayList = new ArrayList<String>();
      
       for(int i = 0 ; i< size ; i++){
          String str=in.next();
          mInputArrayList.add(str);
           
        }
       
        //taking input for search Arraylist
       System.out.println("ArrayList: " +mInputArrayList);
       System.out.print("Keywords arraySize: ");
       int searchSize = in.nextInt();
       for(int i = 0 ; i < searchSize ; i++)
         {
          String str=in.next();
          mSearchArrayList.add(str);
          }
       
       System.out.println("mSearchArrayList: " +mSearchArrayList);
       
       
           int count=0;
           for(String key:mSearchArrayList) 
              {
                for(String inpt:mInputArrayList) 
              {
                if(key.equals(inpt)){
                count++;
                }
                
                 
              }
                
              System.out.println("KeyWord: "+key+" count: "+count); 
              count=0;
              }  
       
        
}
}