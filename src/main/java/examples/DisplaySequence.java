/*
program to display the sequence 1, 2, 2, 4, 8, 32, 256,……………….
*/

import java.util.Scanner;

public class DisplaySequence
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int range = sc.nextInt();

        int firstNumber = 1, secondNumber = 2, number = 0;

        System.out.print (firstNumber + " " + secondNumber + " ");

        for (int loopCounter = 2; loopCounter < range; loopCounter++)
        {
            number = firstNumber * secondNumber;
            firstNumber = secondNumber;
            secondNumber = number;

            System.out.print (number + " ");
        }
    }
}
