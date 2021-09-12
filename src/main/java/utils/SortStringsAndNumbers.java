import java.util.Arrays;
import java.util.Scanner;

public class SortStringsAndNumbers {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String [] arr = new String[6];
        String [] upperCaseArr = new String[6];
        int [] intArr = new int[6];
        String [] printArr = new String[6];
        int counter = 0;
        int counter1 = 0;
        int counter2 = 0;

        for (int loopCounter = 0; loopCounter < 6; loopCounter++)
        {
            String inputString = sc.nextLine();
            String upperCaseValue = inputString.toUpperCase();
            upperCaseArr [counter] = upperCaseValue;
            arr [counter] = inputString;
            counter++;
        }

        try
        {
            for (int loopCounter2 = 0; loopCounter2 < arr.length; loopCounter2++)
            {
                int number = Integer.parseInt(arr [loopCounter2]);
                intArr [counter1] = number;
                counter1++;
            }

            sortInt(intArr);

            for (int loopCounter3 = 0; loopCounter3 < intArr.length; loopCounter3++)
            {
                System.out.println(intArr [loopCounter3]);
            }

            return;
        }
        catch (Exception ex)
        {
            // System.out.println("This is not an Integer");
        }

        Arrays.sort(upperCaseArr);

        for (int loopCounter1 = 0; loopCounter1 < upperCaseArr.length; loopCounter1++)
        {
            for (int loopCounter4 = 0; loopCounter4 < arr.length; loopCounter4++)
            {
                String newString = arr [loopCounter4].toUpperCase();

                if (upperCaseArr [loopCounter1].equals (newString))
                {
                    printArr [counter2] = arr [loopCounter4];
                    counter2++;
                }
            }
        }

        for (int loop = 0; loop < printArr.length; loop++)
        {
            System.out.println(printArr [loop]);
        }
    }

    public static void sortInt (int [] arr)
    {
        for (int loopCounter = 0; loopCounter < arr.length; loopCounter++)
        {
            for (int loopCounter1 = loopCounter + 1; loopCounter1 < arr.length; loopCounter1++)
            {
                if (arr [loopCounter] > arr [loopCounter1])
                {
                    int temp = arr [loopCounter];
                    arr [loopCounter] = arr [loopCounter1];
                    arr [loopCounter1] = temp;
                }
            }
        }
    }
}
