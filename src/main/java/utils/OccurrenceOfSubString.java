import java.util.Scanner;

public class OccurrenceOfSubString {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String newString = sc.nextLine();
        int counter = 0;

        String [] arr = inputString.split("");

        for (int loopCounter = 0; loopCounter < (arr.length - 1); loopCounter++)
        {
            String s = "";

            for (int loopCounter1 = loopCounter; loopCounter1 < (loopCounter + newString.length()); loopCounter1++)
            {
                s = s + arr[loopCounter1];
            }

            if (s.equals (newString))
            {
                counter++;
            }
        }

        System.out.print ("Occurrence of " + newString + " is : " + counter);
    }
}
