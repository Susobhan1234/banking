/*
Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
*/

import java.io.*;
import java.util.*;

public class DictionaryOrder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int length1 = A.length();
        int length2 = B.length();
        int totalLength = length1 + length2;
        System.out.println (totalLength);

        char [] arr1 = A.toCharArray();
        char [] arr2 = B.toCharArray();
        int minLoop = 0;

        if (length1 > length2)
        {
            minLoop = length2;
        }
        else
        {
            minLoop = length1;
        }

        boolean isFirstStringBigger = true;

        for (int counter = 0; counter < minLoop; counter++) {

            int ascii1 = arr1[counter];
            int ascii2 = arr2[counter];

            if (ascii1 > ascii2) {
                isFirstStringBigger = true;
                break;
            }
            else if (ascii1 == ascii2)
            {
                isFirstStringBigger = false;
            }
            else {
                isFirstStringBigger = false;
                break;
            }
        }

        if (isFirstStringBigger == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        String [] str1 = A.split("");
        String [] str2 = B.split("");
        String newStr1 = "";
        String newStr2 = "";

        for (int i = 0; i < str1.length; i++)
        {
            if (i == 0)
            {
                newStr1 = str1[i].toUpperCase();
            }
            else{
                newStr1 = newStr1 + str1[i];
            }
        }

        for (int j = 0; j < str2.length; j++)
        {
            if (j == 0)
            {
                newStr2 = str2[j].toUpperCase();
            }
            else {
                newStr2 = newStr2 + str2[j];
            }
        }

        System.out.println(newStr1 + " " + newStr2);
    }
}
