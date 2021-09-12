import java.util.Scanner;

public class PermutationOfTwoNumbers {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        double returnData1 = factorialValue(n);
        double returnData2 = 0;

        if (n > r)
        {
            returnData2 = factorialValue((n - r));
        }
        else
        {
            returnData2 = factorialValue((r - n));
        }

        double result = ((returnData1) / returnData2);

        System.out.println(result);
    }

    public static double factorialValue (int number)
    {
        double value = 1;

        for (int loopCounter = 1; loopCounter <= number; loopCounter++)
        {
            value = value * loopCounter;
        }

        return value;
    }
}
