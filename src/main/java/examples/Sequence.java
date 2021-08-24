/*
C program to display the sequence 1, 4, 9, 16, 25, 36, 49,………………
*/

import java.util.Scanner;

public class Sequence
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        int range = sc.nextInt();
        int number = 0;

        for (int loopCounter = 1; loopCounter <= range; loopCounter++)
        {
            number = loopCounter * loopCounter;
            System.out.print (number + ", ");
        }
    }
}
