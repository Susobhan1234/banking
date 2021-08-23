/*Life Cycle Of A Software Development
Requirement

IP address of a computer has 4 integer numbers - each number must be between 0 and 255
Write a java program to determine if a string contain valid IP address format
For example, if input is 123.12.01.11 then display "Valid IP Address"
If input is 123.5445.45 then display "Invalid IP Address"
If input is .123.5445.45 then display "Invalid IP Address"
If input is a.123.5445.45 then display "Invalid IP Address"

Analysis
I analyzed the requirement and understood what to be done

Design
I have put together a skeleton how the program is to be coded

Coding
I have coded the Java program based on the design I have come up with.

Unit Testing
I executed the program provided the inputs aand validated the output to make sure that the output is display correctly.

Quality Testing
Another person who did not write the code they will do the testing and make sure that the program is running as per requirement.

Production Deployment
The code will go to production for everybody else to use the code.
*/


import java.util.Scanner;

public class CheckIp {
    public static void main (String [] args)
    {
        try {
            Scanner sc = new Scanner(System.in);
            String inputString = sc.nextLine();
            String[] stringArr = inputString.split("\\.");


            if (stringArr.length != 4) {
                System.out.println("Invalid IP Address");
                return;
            }

            String newStr = "";

            for (int loopCounter = 0; loopCounter < stringArr.length; loopCounter++) {
                int number = Integer.parseInt(stringArr[loopCounter]);

                if (number >= 0 && number <= 255) {
                    newStr = newStr + "" + number;
                } else {
                    System.out.println("Invalid IP Address");
                    return;
                }
            }

            System.out.println("Valid IP Address");
        }
        catch (Exception e)
        {
            System.out.println("Invalid IP Address");
        }
    }
}
