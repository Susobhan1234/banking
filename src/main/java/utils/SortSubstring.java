/*
Input Format

The first line contains a string denoting s.
The second line contains an integer denoting k.

Constraints
1 <= |s| <= 1000
s consists of English alphabetic letters only (i.e., [a-zA-Z]).
Sample Input 0

welcometojava
3
Sample Output 0

ava
wel
*/
import java.util.Scanner;
import java.util.Arrays;
public class SortSubstring {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String [] newArr = new String[100];
        int count = 0, count2 = 0;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        String [] stringArr = s.split("");

        for (int loopCounter = 0; loopCounter < (s.length() - (k - 1)); loopCounter++)
        {
            String newString = s.substring (loopCounter, loopCounter + k);
            newArr[count] = newString;
            count++;
        }

        for (int loopCounter1 = 0; loopCounter1 < newArr.length; loopCounter1++)
        {
            if (newArr[loopCounter1] != null)
            {
                count2++;
            }
        }

        String [] newArr2 = new String[count2];
        int count3 = 0;

        for (int loopCounter1 = 0; loopCounter1 < newArr.length; loopCounter1++)
        {
            if (newArr[loopCounter1] != null)
            {
                newArr2[count3] = newArr[loopCounter1];
                count3++;
            }
        }

        Arrays.sort (newArr2);

        smallest = newArr2[0];
        largest = newArr2[newArr2.length - 1];
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
