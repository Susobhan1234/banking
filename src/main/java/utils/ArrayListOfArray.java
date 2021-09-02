import java.util.*;

public class ArrayListOfArray
{

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList inputNumbersList = new ArrayList();

        for (int loopCounter = 0; loopCounter < n; loopCounter++)
        {
            int d = sc.nextInt();
            int [] arr = new int[d];
            int count = 0;

            for (int loopCounter1 = 0; loopCounter1 < d; loopCounter1++)
            {
                int value = sc.nextInt();
                arr[count] = value;
                count++;
            }

            inputNumbersList.add(arr);
        }

        int q = sc.nextInt();

        for (int loopCounter4 = 0; loopCounter4 < q; loopCounter4++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            try {
                int[] numbers = (int[]) inputNumbersList.get(x - 1);
                System.out.println(numbers[y - 1]);
            }
            catch (Exception ex)
            {
                System.out.println ("ERROR!");
            }
        }
    }
}
