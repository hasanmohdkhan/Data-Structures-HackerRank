import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter: ");
        int n = in.nextInt();
        int q = in.nextInt();
        List<Integer>[] sequences = new List[n]; // n=2
        for (int n_i = 0; n_i < n; n_i++) { //loop run 2 times 
            sequences[n_i] = new ArrayList<>();
            // create two objects of ArrayList type
        }
        int lastans = 0;
        for (int i = 0; i < q; i++) {
            int t = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            List<Integer> sequence = sequences[(x^lastans)%n];
            switch (t) {
                case 1:
                    sequence.add(y);
                    break;
                case 2:
                    lastans = sequence.get(y%sequence.size());
                    System.out.println(lastans);
                    break;
            }
        }

    }

}