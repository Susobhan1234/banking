import java.util.Scanner;

public class ReverseString {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        char [] arr = inputString.toCharArray();

        for (int loopCounter = (arr.length - 1); loopCounter >= 0; loopCounter--)
        {
            System.out.print (arr[loopCounter]);
        }
    }
}
