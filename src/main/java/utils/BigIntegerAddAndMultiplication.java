import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BigIntegerAddAndMultiplication {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String inputString1 = sc.nextLine();
        String inputString2 = sc.nextLine();
        BigInteger a = new BigInteger(inputString1);
        BigInteger b = new BigInteger(inputString2);

        BigInteger s = a.add(b);
        System.out.println(s);

        BigInteger m = a.multiply(b);
        System.out.println(m);
    }
}