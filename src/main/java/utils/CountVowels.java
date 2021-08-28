import java.util.Scanner;

public class CountVowels
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();

        char [] inputChar = inputString.toCharArray ();
        int counter = 0;

        for (int loopCounter1 = 0; loopCounter1 < inputChar.length; loopCounter1++)
        {
            char newChar = inputChar [loopCounter1];

            if ((newChar == 'a') || (newChar == 'e') || (newChar == 'i') || (newChar == 'o') || (newChar == 'u'))
            {
                counter++;
            }
            else if ((newChar == 'A') || (newChar == 'E') || (newChar == 'I') || (newChar == 'O') || (newChar == 'U'))
            {
                counter++;
            }
        }

        System.out.println (counter);
    }
}
