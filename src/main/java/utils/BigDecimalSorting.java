import java.math.BigDecimal;
import java.util.*;

class BigDecimalSorting
{
    public static void main(String []args)
    {
        //Input
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String [] s = new String[n+2];
        for (int i = 0; i < n; i++)
        {
            s[i] = sc.next();
        }
        sc.close();

        BigDecimal [] arr = new BigDecimal[n];
        int counter = 0, count = 0;

        for (int loopCounter = 0; loopCounter < n; loopCounter++)
        {
            BigDecimal a = new BigDecimal(s[loopCounter]);
            arr[counter] = a;
            counter++;
        }

        for (int loopCounter1 = 0; loopCounter1 < n; loopCounter1++) // 6 1 8
        {
            for (int loopCounter2 = loopCounter1 + 1; loopCounter2 < n; loopCounter2++)
            {
                if (arr [loopCounter1] == arr[loopCounter2])
                {
                    
                }
                else {
                    BigDecimal temp = arr[loopCounter1].max(arr[loopCounter2]);
                    arr[loopCounter2] = arr[loopCounter1].min(arr[loopCounter2]);
                    arr[loopCounter1] = temp;
                }
            }
        }
        //Write your code here

        //Output
        for(int i = 0; i < n; i++)
        {
            System.out.println (arr[i]);
        }
    }
}