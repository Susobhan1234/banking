/*
3. C program to display the sequence AMM, COO, EQQ,……….
*/

import java.util.Scanner;

public class Q3
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();

        int firstValue = 65, secondValue = 77;
        char firstValueChar = (char) firstValue;
        char secondValueChar = (char) secondValue;

        System.out.print (firstValueChar + "" + secondValueChar + "" + secondValueChar + " ");

        for (int loopCounter = 1; loopCounter < range; loopCounter++)
        {
            firstValue = firstValue + 2;
            secondValue = secondValue + 2;
            char firstValueChar2 = (char) firstValue;
            char secondValueChar2 = (char) secondValue;
            System.out.print (firstValueChar2 + "" + secondValueChar2 + "" + secondValueChar2 + " ");
        }
    }
}