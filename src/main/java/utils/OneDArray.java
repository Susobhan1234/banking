import java.util.*;

public class OneDArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] a = new int [n];
        int counter = 0;

        for (int loopCounter = 0; loopCounter < n; loopCounter++)
        {
            int x = scan.nextInt();
            a [counter] = x;
            counter++;
        }

        scan.close();

        // Prints each sequential element in array a
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}