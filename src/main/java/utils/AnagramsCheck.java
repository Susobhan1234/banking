import java.util.Scanner;
import java.util.Arrays;

public class AnagramsCheck {
    static boolean isAnagram(String a, String b)
    {
        // Complete the function

        String al = a.toLowerCase();
        String bl = b.toLowerCase();

        String [] newArr1 = al.split("");
        String [] newArr2 = bl.split("");

        Arrays.sort(newArr1);
        Arrays.sort(newArr2);

        String newString1 = "";
        String newString2 = "";

        for (int loopCounter1 = 0; loopCounter1 < newArr1.length; loopCounter1++) //anagram
        {
            newString1 = newString1 + newArr1[loopCounter1];
        }

        for (int loopCounter2 = 0; loopCounter2 < newArr2.length; loopCounter2++) //anagram
        {
            newString2 = newString2 + newArr2[loopCounter2];
        }

        if (newString1.equals (newString2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
