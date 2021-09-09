import java.util.Scanner;

public class FindUniqueString
{
    public static void main (String [] args)
    {
        int counter = 0;
        int counter2 = 0;
        String [] arr = new String[10];
        String [] newArr = new String[10];

        for ( ; ; )
        {
            Scanner sc = new Scanner(System.in);
            String inputString = sc.nextLine();

            if (inputString.equals ("end"))
            {
                break;
            }
            else
            {
                arr[counter] = inputString;
                counter++;
            }
        }

        System.out.println("Unique Strings Are : ");

        for (int loopCounter = 0; loopCounter < counter; loopCounter++)
        {
            boolean returnData = searchingString(newArr, arr[loopCounter]);

            if (returnData == false)
            {
                newArr [counter2] = arr[loopCounter];
                counter2++;
            }
        }

        for (int loopCounter1 = 0; loopCounter1 < newArr.length; loopCounter1++)
        {
            if (newArr[loopCounter1] != null)
            {
                System.out.println(newArr[loopCounter1]);
            }
        }
    }

    public static boolean searchingString(String [] whereToSearch, String whatToSearch)
    {
        int count = 0;
        for (int loopCounter1 = 0; loopCounter1 < whereToSearch.length; loopCounter1++)
        {
            if (whereToSearch[loopCounter1] != null)
            {
                if (whereToSearch[loopCounter1].equals(whatToSearch)) {
                    return true;
                }
            }
        }

        return false;
    }
}
