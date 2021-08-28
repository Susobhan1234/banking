/*
C program to check whether a number is prime or not.
 */


import java.util.Scanner;

public class CheckPrime
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int loopCounter = 2; loopCounter < number; loopCounter++)
        {
            if (number % loopCounter == 0)
            {
                System.out.println ("Not prime number.");
                return;
            }
        }

        System.out.println ("prime number.");
    }
}
