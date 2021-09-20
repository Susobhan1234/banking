import java.math.BigDecimal;
import java.math.BigInteger;

public class TryCatchFinally
{
    TryCatchFinally ()
    {

    }

    public static void main (String [] args)
    {
        try
        {
            String newString = "123456 ";
            BigDecimal number = new BigDecimal (newString.trim());
            System.out.println(number);
//            System.exit(0);
//            return;
        }
//        catch (Exception ex)
//        {
//            ex.printStackTrace();
//        }
        finally
        {
            System.out.println("I'm inside finally block");
        }
    }
}
