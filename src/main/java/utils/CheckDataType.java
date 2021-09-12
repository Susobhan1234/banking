public class CheckDataType {
    public static void main (String [] args)
    {
        int result1 = 0; // 2^32 - 1
        int number = 0;

        for ( ; ; )
        {
            number = number + 1;

            if (number > result1)
            {
                result1 = number;
            }
            else
            {
                System.out.println(result1);
                break;
            }
        }
    }
}
