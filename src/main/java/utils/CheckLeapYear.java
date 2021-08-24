import java.util.Scanner;
public class CheckLeapYear {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int year = Integer.parseInt (inputString);

        if (((year % 4 == 0) && (year % 100 != 0)) || ((year % 100 == 0) && (year % 400 == 0)))
        {
            System.out.println ("Input year is a leap year");
        }
        else
        {
            System.out.println ("Input year is not a leap year");
        }
    }
}
