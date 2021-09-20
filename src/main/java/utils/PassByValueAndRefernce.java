import java.math.BigInteger;

public class PassByValueAndRefernce
{
    PassByValueAndRefernce()
    {

    }

    public static void main (String [] args)
    {
        String newString = "susobhan";
        System.out.println("Before calling the method : " + newString);
        String returnValue = modifyStringValue(newString);
        System.out.println("After calling the method : " + returnValue);
        System.out.println("After calling the method main value : " + newString);

        BigInteger number = new BigInteger("88848");
        System.out.println("Before calling the method : " + number.intValue());
        modifyBigIntegerValue(number);
        System.out.println("After calling the method : " + number.intValue());
    }

    public static String modifyStringValue (String newString)
    {
        newString = "669";
        return newString;
    }

    public static BigInteger modifyBigIntegerValue (BigInteger n)
    {
        n = new BigInteger("6999999");
        return n;
    }
}
