
/*
 12. C program to display prime numbers between two intervals.
 */

import java.util.Scanner;

public class PrimeNumberTwoInterval
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int counter = 0;
        int [] arr = new int [100];

        for (int loopCounter = firstNumber; loopCounter <= secondNumber; loopCounter++)
        {
            boolean returnValue = prime (loopCounter);

            if (returnValue == true)
            {
                arr [counter] = loopCounter;
                counter++;
            }
        }

        for (int loopCounter2 = 0; loopCounter2 < arr.length; loopCounter2++)
        {
            if (arr [loopCounter2] != 0)
            {
                System.out.print (arr [loopCounter2] + " ");
            }
        }
    }

    public static boolean  prime (int number)
    {
        int loopCounter = 0;

        for (loopCounter = 2; loopCounter < number; loopCounter++)
        {
            if (number % loopCounter == 0)
            {
                return false;
            }
        }

        return true;
    }
}