public class TwoDimensionalArray {
    TwoDimensionalArray()
    {

    }

    public static void main (String [] args)
    {
        int [][] twoDimIntArray = new int [3][4];

        for (int rowNum = 0; rowNum < 3; rowNum++)
        {
            for (int columnNum = 0; columnNum < 4; columnNum++)
            {
                twoDimIntArray [rowNum][columnNum] = rowNum + columnNum;
            }
        }

        for (int rowNum = 0; rowNum < 3; rowNum++)
        {
            for (int columnNum = 0; columnNum < 4; columnNum++)
            {
                System.out.print(twoDimIntArray [rowNum][columnNum] + "\t");
            }

            System.out.println();
        }

    }
}
