import java.util.Scanner;

public class Anagram {
    static boolean isAnagram(String a, String b)
    {
        // Complete the function
        int [] intArr1 = new int[26];
        int [] intArr2 = new int[26];

        String al = a.toLowerCase();
        String bl = b.toLowerCase();

        char [] newArr1 = al.toCharArray();
        char [] newArr2 = bl.toCharArray();

        for (int loopCounter = 0; loopCounter < newArr1.length; loopCounter++)
        {
            int returnValue = searching(newArr1, newArr1[loopCounter]);
            int ascii = newArr1[loopCounter];
            intArr1 [ascii - 97] = returnValue;
        }

        for (int loopCounter1 = 0; loopCounter1 < newArr2.length; loopCounter1++)
        {
            int returnValue = searching(newArr2, newArr2[loopCounter1]);
            int ascii = newArr2[loopCounter1];
            intArr2 [ascii - 97] = returnValue;
        }

        for (int loopCounter2 = 0; loopCounter2 < intArr1.length; loopCounter2++)
        {
            if (intArr1[loopCounter2] != intArr2[loopCounter2])
            {
                return false;
            }
        }

        return true;
    }

    public static int searching (char [] whereToSearch, char whatToSearch)
    {
        int count = 0;
        for (int loopCounter1 = 0; loopCounter1 < whereToSearch.length; loopCounter1++)
        {
            if (whereToSearch [loopCounter1] == whatToSearch)
            {
                count++;
            }
        }

        return count;
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
