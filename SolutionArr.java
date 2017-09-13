import java.util.Scanner;
public class SolutionArr {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter: ");
        int N = scan.nextInt();
        int M = scan.nextInt();
        
        /* Save interval endpoints' "k" values in array */
        long [] array = new long[N + 1];
        
        scan.close();
        for (int i = 0; i < N; i++) {
             
            System.out.println("array: "+array[i]);
            
        }
        
        /* Find max value */
        
        
        //System.out.println(max);
    }
}
