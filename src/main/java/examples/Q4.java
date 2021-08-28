/*
4. C program to display the sequence ABA, BCB, CDC, DED, ……………….
 */

import java.util.Scanner;

public class Q4
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int firstValue = 65, secondValue = firstValue + 1;

        for (int loopCounter = 1; loopCounter <= range; loopCounter++)
        {
            char firstValueChar = (char) firstValue;
            char secondValueChar = (char) secondValue;

            System.out.print (firstValueChar + "" + secondValueChar + "" + firstValueChar + " ");
            firstValue = firstValue + 1;
            secondValue = firstValue + 1;
        }
    }
}