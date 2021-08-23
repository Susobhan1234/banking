/*
C program to find factorial of a number.
 */

import java.util.Scanner;

public class Factorial {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        String inputString = sc.nextLine ();
        int number = Integer.parseInt (inputString);
        int fact = 1;

        for (int loopCounter = 1; loopCounter <= number; loopCounter++)
        {
            fact = fact * loopCounter;
        }

        System.out.println (fact);
    }
}
