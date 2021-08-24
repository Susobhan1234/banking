/*
program to calculate the power of a number
*/

import java.util.Scanner;

public class PowerOfNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int number = sc.nextInt();
        int powerValue = sc.nextInt();
        int result = 1;

        for (int loopCounter = 1; loopCounter <= powerValue; loopCounter++)
        {
            result = result * number;
        }

        System.out.println (result);
    }
}
