import java.util.Scanner;

public class CheckValidDate {
    public static void main (String [] args) {
        System.out.println("Enter date dd/mm/yyyy format.");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        String [] strArr = inputString.split("/");

        int day = Integer.parseInt (strArr[0]);
        int month = Integer.parseInt (strArr[1]);
        int year = Integer.parseInt (strArr[2]);

        if ((month < 1) || (month > 12))
        {
            System.out.println("Invalid Date!!");
        }
        else if ((month == 01) && (month == 03) && (month == 05) && (month == 07) && (month == 8) && (month == 10) && (month ==12))
        {
            if ((day < 1) || (day > 31))
            {
                System.out.println("Invalid Date!!");
            }
            else
            {
                System.out.println("Valid Date.");
            }
        }
        else if ((month == 04) && (month == 06) && (month == 9) && (month == 11))
        {
            if ((day < 1) || (day > 30))
            {
                System.out.println("Invalid Date!!");
            }
            else
            {
                System.out.println("Valid Date.");
            }
        }
        else if (month == 02)
        {
            boolean returnValue = leapYear(year);

            if (returnValue == true)
            {
                if ((day < 1) || (day > 29))
                {
                    System.out.println("Invalid Date!!");
                }
                else
                {
                    System.out.println("Valid Date.");
                }
            }
            else
            {
                if ((day < 1) || (day > 28))
                {
                    System.out.println("Invalid Date!!");
                }
                else
                {
                    System.out.println("Valid Date.");
                }
            }
        }
    }

    public static boolean leapYear (int year)
    {
        if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 100 == 0) && (year % 400 == 0)))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
