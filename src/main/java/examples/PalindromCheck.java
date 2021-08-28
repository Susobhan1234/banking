/*
  7. C program to check whether a number is palindrome or not.
 */


import java.util.Scanner;

public class PalindromCheck
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        char [] charArr = number.toCharArray ();
        String newString2 = "";

        for (int loopCounter = charArr.length - 1; loopCounter >= 0; loopCounter--)
        {
            newString2 = newString2 + charArr [loopCounter];
        }

        if (newString2.equals (number))
        {
            System.out.println ("Palindrome number.");
        }
        else
        {
            System.out.println ("Not Palindrome number.");
        }
    }
}
