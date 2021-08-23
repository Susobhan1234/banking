/*
program to display the series 1, 3, 5, 7, 9,
*/

import java.util.Scanner;

public class DisplaySeries
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        String inputString = sc.nextLine ();
        int range = Integer.parseInt (inputString);

        int loopCounter = 0;

        for (loopCounter = 1; loopCounter <= range; loopCounter++)
        {
            int number = ((2 * loopCounter) - 1);
            System.out.print (number + " ");
        }
    }
}

