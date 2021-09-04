import java.util.ArrayList;
import java.util.Scanner;

public class ListExample
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        ArrayList arrLst = new ArrayList();

        for (int loopCounter = 0; loopCounter < length; loopCounter++)
        {
            int number = sc.nextInt();
            arrLst.add(number);
        }

        int q = sc.nextInt();

        for (int loopCounter1 = 0; loopCounter1 < q; loopCounter1++)
        {
            Scanner sc2 = new Scanner(System.in);
            String inputString = sc2.nextLine();

            if (inputString.equals ("Insert"))
            {
                int x = sc2.nextInt();
                int y = sc2.nextInt();
                arrLst.add(x, y);
            }
            else if (inputString.equals ("Delete"))
            {
                int z = sc2.nextInt();
                arrLst.remove(z);
            }
        }

        /*
         for (int loopCounter1 = 0; loopCounter1 < q;)
        {
            String inputString = sc.nextLine();

            if (inputString.equals ("Insert"))
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                arrLst.add(x, y);
                loopCounter1++;
            }
            else if (inputString.equals ("Delete"))
            {
                int z = sc.nextInt();
                arrLst.remove(z);
                loopCounter1++;
            */

        for (int loopCounter2 = 0; loopCounter2 < arrLst.size(); loopCounter2++)
        {
            System.out.print(arrLst.get(loopCounter2) + " ");
        }
    }
}