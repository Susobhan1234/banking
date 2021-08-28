
/*
10. Read a number from STDIN, then display the sequence given below:
Input: 52934
Output: A5, B2, C9, D3, E4 
*/

import java.util.Scanner;

public class Q10
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        char [] inputCharArray = inputString.toCharArray ();
        
        int asciiValue = 65;

        for (int loopCounter = 0; loopCounter < inputCharArray.length; loopCounter++)
        {
            char charVal = (char) asciiValue;

            String newString = charVal + "" + inputCharArray [loopCounter];
            System.out.print (newString + " ");
            asciiValue = asciiValue + 1;
        }
    }
}