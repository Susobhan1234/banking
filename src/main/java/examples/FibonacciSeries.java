/*
program to display Fibonacci sequence 0, 1, 1, 2, 3, 5, 8,…………
*/

import java.util.Scanner;

public class FibonacciSeries
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int range = sc.nextInt();

        int number1 = 0, number2 = 1, newNumber = 0;

        System.out.print (number1 + " " + number2 + " ");

        for (int loopCounter = 3; loopCounter <= range; loopCounter++)
        {
            newNumber = number1 + number2;
            number1 = number2;
            number2 = newNumber;

            System.out.print (newNumber + " ");
        }
    }
}