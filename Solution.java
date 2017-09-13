import java.util.Scanner;
public class Solution {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter: ");
        int N = scan.nextInt();
        int M = scan.nextInt();
        
        /* Save interval endpoints' "k" values in array */
        long [] array = new long[N + 1];
        while (M-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int k = scan.nextInt();
            array[a-1] += k;
            System.out.println("array[a-1]: "+array[a-1]);
            array[b]   -= k; // see comment at end of code
           System.out.println("array[b]: "+array[b]+" b: "+b );
        }
        scan.close();
        for (int i = 0; i < N; i++) {
             
            System.out.println("array: "+array[i]);
            
        }
        
        /* Find max value */
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            sum += array[i];
            System.out.println("Sum: "+sum);
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
    }
}
