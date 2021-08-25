import java.io.*;
import java.util.*;

public class Regex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        // He is a very very good boy, isn't he?
        String [] strArr = s.split("'|,| |\\?|!|\\.|_|@|\\\\|ry");

        String [] newArr = new String [strArr.length];

        int count = 0, counter = 0;

        for (int loopCounter = 0; loopCounter < strArr.length; loopCounter++)
        {
            if (strArr[loopCounter].equals (""))
            {
                count++;
            }
            else
            {
                newArr [counter] = strArr[loopCounter];
                counter++;
            }
        }

        System.out.println(strArr.length - count);

        for (int loopCounter1 = 0; loopCounter1 < newArr.length; loopCounter1++)
        {
            if (newArr[loopCounter1] == null)
            {
                count++;
            }
            else
            {
                System.out.println (newArr[loopCounter1]);
            }
        }

        scan.close();
    }
}

