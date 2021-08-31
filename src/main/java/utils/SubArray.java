import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int counter = 0, count = 0, sum = 0;

        for (int loopCounter = 0; loopCounter < n; loopCounter++) {
            int x = scan.nextInt();
            a[counter] = x;
            counter++;
        }

        for (int loopCounter1 = 0; loopCounter1 < a.length; loopCounter1++)
        {
            sum = 0;
            for (int loopCounter2 = loopCounter1; loopCounter2 < a.length; loopCounter2++)
            {
                sum = sum + a[loopCounter2];

                if (sum < 0)
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
