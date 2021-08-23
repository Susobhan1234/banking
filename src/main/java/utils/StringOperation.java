/*
toUpperCase
toLowerCase
equals
toCharArray
length
substring
indexOf
replaceAll
split
*/

import java.util.Scanner;
public class StringOperation
{
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString1 = sc.nextLine();
        String inputString2 = sc.nextLine();

        /* For Upper Case */
        String newString1 = inputString1.toUpperCase();
        System.out.println("Upper Case value is : " + newString1);

        /* For Lower Case */
        String newString2 = inputString1.toLowerCase();
        System.out.println("Lower Case value is : " + newString2);

        /* Compare two String variables */
        if(inputString1.equals (inputString2))
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are different");
        }

        /* Display the number of characters in the string */
        char [] charArr = inputString1.toCharArray();
        int loopCounter = 0, count = 0;

        for (loopCounter = 0; loopCounter < charArr.length; loopCounter++)
        {
            int asciiValue = charArr[loopCounter];

            if (((asciiValue >= 65) && (asciiValue <= 90)) || ((asciiValue >= 90) && (asciiValue <= 122)))
            {
                count++;
            }
        }

        System.out.println("Number of characters in the string is : " + count);

        /* Display a sub string */
        String newString = inputString1.substring (4, 8);
        System.out.println ("New sub string is : " + newString);

        /* check if it contains the pattern "pus" */
        String checkString = "pus";
        int startingIndex = inputString1.indexOf (checkString);

        if (startingIndex != -1)
        {
            System.out.println("The string contains pus");
        }
        else {
            System.out.println("The string does not contains pus");
        }

        /* Display the two words Computer and Science in two different lines */
        String[] words = inputString1.split(" ");

        for (int loop = 0; loop < words.length; loop++)
        {
            System.out.println (words[loop]);
        }

        /* convert the first character of each word to lowercase */
        String[] stringArr = inputString1.split(" ");

        for (int counter = 0; counter < words.length; counter++)
        {
            String value2 = stringArr[counter].toLowerCase();
            System.out.print (value2 + " ");
        }

        /* replace all occurrence of the letter "e" with the string "aky" */
        String valueStri = "";

        for (int counter = 0; counter < charArr.length; counter++)
        {
            if (charArr[counter] == 'e')
            {
                valueStri = valueStri + "aky";
            }
            else {
                valueStri = valueStri + charArr[counter];
            }
        }

        System.out.println(valueStri);

        String replaceString = inputString1.replaceAll("e", "aky");
        System.out.println("After replacement the string is : " + replaceString);

        /* 10, convert the integer variable to String */
        int intVal = 198;
        String strVal = "" + intVal;
        System.out.println("The string is : " + strVal);

        /* convert the double variable to String */
        double douleValue = 2992389.8913;
        String strVal3 = "" + douleValue;
        System.out.println("The string is : " + strVal3);

        /* convert the char array to a String */
        String newStr1 = "";

        for(int i = 0; i < charArr.length; i++)
        {
            newStr1 = newStr1 + charArr[i];
        }

        System.out.println("The string is : " + newStr1);
    }
}
