import java.util.Scanner;

public class CountEachChar
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String newString = inputString.toLowerCase();

        char [] charArr = newString.toCharArray ();
        int [] intArr = new int[26];


        for (int loopCounter = 0; loopCounter < charArr.length; loopCounter++)
        {
            int returnValue = searchingChar(charArr, charArr[loopCounter]);
            int ascii = charArr[loopCounter];
            intArr [ascii - 97] = returnValue;
        }

        for (int loppCounter2 = 0; loppCounter2 < intArr.length; loppCounter2++)
        {
            if (intArr[loppCounter2] != 0)
            {
                char newChar = (char) (loppCounter2 + 97);
                System.out.println("Count of " + newChar + " = " + intArr [loppCounter2]);
            }
        }
    }

    public static int searchingChar (char [] whereToSearch, char whatToSearch)
    {
        int count = 0;
        for (int loopCounter1 = 0; loopCounter1 < whereToSearch.length; loopCounter1++)
        {
            if (whereToSearch [loopCounter1] == whatToSearch)
            {
                count++;
            }
        }

        return count;
    }
}
