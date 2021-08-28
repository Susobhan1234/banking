/*
 6. C program to reverse a number.
 */

import java.util.Scanner;

public class ReveseNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        char [] newChar = number.toCharArray ();

        for (int loopCounter = newChar.length - 1; loopCounter >= 0; loopCounter--)
        {
            System.out.print (newChar [loopCounter]);
        }
    }
}
