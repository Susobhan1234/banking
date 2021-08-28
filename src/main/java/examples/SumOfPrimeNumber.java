/*
 9. C program to find the sum of first n prime numbers.
 */

import java.util.Scanner;

public class SumOfPrimeNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0, counter = 0;
        int [] arr = new int [1000];

        for (int loopCounter1 = 2; loopCounter1 <= number ; loopCounter1++)
        {
            boolean returnValue = prime (loopCounter1);

            if (returnValue == true)
            {
                arr [counter] = loopCounter1;
                counter++;
            }
        }

        for (int loopCounter3 = 0; loopCounter3 < arr.length;  loopCounter3++)
        {
            sum = sum + arr [loopCounter3];
        }

        System.out.println (sum);
    }

    public static boolean prime (int number)
    {
        for (int loopCounter2 = 2; loopCounter2 < number; loopCounter2++)
        {
            if (number % loopCounter2 == 0)
            {
                return false;
            }
        }

        return true;
    }
}
