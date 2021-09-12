import java.util.Scanner;

public class AllFactorsOfNumber
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int loopCounter = 1; loopCounter <= number; loopCounter++)
        {
            if (number % loopCounter == 0)
            {
                System.out.print( loopCounter + " ");
            }
        }
    }
}
