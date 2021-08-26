/*
Sample Input

12324.134
Sample Output

US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
 */

import java.util.*;
import java.text.*;
public class CurrencyFormate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        String newString = "" + payment;
        String [] arr = newString.split("");
        scanner.close();

        String us = "";
        String india = "";
        String china = "";
        String france = "";

        // Write your code here.
        for(int loopCounter =0; loopCounter < arr.length; loopCounter++)
        {
            if (loopCounter < 2) {
                us = us + arr[loopCounter];
                india = india + arr[loopCounter];
                china = china + arr[loopCounter];
                france = france + arr[loopCounter];
            }
            else if (loopCounter == 2)
            {
                us = us + ",";
                india = india + ",";
                china = china + ",";
                france = france + " ";
            }
            else
            {
                us = us + arr[loopCounter - 1];
                india = india + arr[loopCounter - 1];
                china = china + arr[loopCounter - 1];
                france = france + arr[loopCounter - 1];
            }
        }

        String replaceString = france.replace('.',',');

        us = "$" + us;
        india = "Rs." + india;
        china = "￥" + china;
        france = replaceString + " €";

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
