/*
Given two string values,

if the first string appears in dictionary before second String then display "First string is smaller than second string"
if the first string appears in dictionary after second String then display "First string is bigger than second string"

Hints:
You have to put the two String values into a String array
Use Arrays.sort to sort the array
The first index will have the string which is smaller
The second index will have the string which is bigger
 */

import java.util.Scanner;
import java.util.Arrays;
public class DictionaryFactor {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String[] stringArr = inputString.split(" ");
        String newStr1 = stringArr[0];

        Arrays.sort(stringArr);
        String newStr2 = stringArr[0];

        if(newStr1.equals (newStr2))
        {
            System.out.println("First string is smaller than second string");
        }
        else
        {
            System.out.println("First string is bigger than second string");
        }
    }
}
