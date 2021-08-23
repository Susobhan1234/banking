/*
program to display the series 0,0,2,1,4,2,6,3,8,4
*/
import java.util.Scanner;

public class Series
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner (System.in);
        String inputString = sc.nextLine ();
        int range = Integer.parseInt (inputString);


        int value1 = 0, value2 = 0;

        for (int loopCounter1 = 0; loopCounter1 < range; loopCounter1++)
        {
            value1 = loopCounter1 * 2;
            value2 = loopCounter1 * 1;
            System.out.print (value1 + " " + value2 + " ");
        }
    }
}