import java.io.*;
import java.math.*;

public class CheckPrimeInBigint {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger b = new BigInteger(n);

        if (b.isProbablePrime (1))
        {
            System.out.println ("prime");
        }
        else
        {
            System.out.println ("not prime");
        }

        bufferedReader.close();
    }
}
