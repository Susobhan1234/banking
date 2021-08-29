import java.math.BigInteger;

public class BigintegerTest {
    public static void main (String [] args)
    {
        // Convert String to BigInteger
        BigInteger object1 = new BigInteger("8585");
        BigInteger object2 = new BigInteger("8586");
        
        System.out.println (object1);

        // Convert BigInteger to double
        System.out.println (object1.doubleValue());

        // Check values are same or not
        if (object1.equals (object2))
        {
            System.out.println ("Same value");
        }
        else
        {
            System.out.println ("Different value");
        }

        // Find out max bigInteger
        System.out.println (object2.max(object1));

        // Find out subtraction
        System.out.println (object1.subtract(object2));
    }
}
