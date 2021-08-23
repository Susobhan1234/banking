import java.util.Arrays;

public class SortingArray {
    public static void main (String [] args)
    {
        /*---------------Int-----------------*/
        int [] intArray = new int [3];
        intArray [0] = 5;
        intArray [1] = 4;
        intArray [2] = 3;

        sortIntArr (intArray);

        for (int loopCounter2 = 0; loopCounter2 < intArray.length; loopCounter2++)
        {
            System.out.println(intArray[loopCounter2]);
        }

        /*---------------Double-----------------*/
        double [] doubleArr = new double [3];
        doubleArr [0] = 1.2;
        doubleArr [1] = 0.2;
        doubleArr [2] = 10.2;
        sortDoubleArr (doubleArr);

        for (int loopCounter5 = 0; loopCounter5 < doubleArr.length; loopCounter5++)
        {
            System.out.println(doubleArr[loopCounter5]);
        }

        /*---------------Char-----------------*/
        char [] charArr = new char [3];
        charArr [0] = 'a';
        charArr [1] = 'A';
        charArr [2] = 'S';
        sortCharArr (charArr);

        for (int loopCounter6 = 0; loopCounter6 < charArr.length; loopCounter6++)
        {
            System.out.println(charArr[loopCounter6]);
        }

        /*---------------String-----------------*/
        String [] stringArr = new String [4];
        stringArr [0] = "Susobhan";
        stringArr [1] = "masanta";
        stringArr [2] = "susobhan";
        stringArr [3] = "Masanta";
        Arrays.sort(stringArr);

        for (int loopCounter7 = 0; loopCounter7 < stringArr.length; loopCounter7++)
        {
            System.out.println(stringArr[loopCounter7]);
        }
    }

    public static void sortIntArr (int [] intArray)
    {
        for (int loopCounter = 0; loopCounter < intArray.length; loopCounter++)
        {
            for (int loopCounter1 = loopCounter + 1; loopCounter1 < intArray.length; loopCounter1++)
            {
                if (intArray [loopCounter] > intArray [loopCounter1])
                {
                    int temp = intArray [loopCounter];
                    intArray [loopCounter] = intArray [loopCounter1];
                    intArray [loopCounter1] = temp;
                }
            }
        }
    }

    public static void sortDoubleArr (double [] doubleArr)
    {
        for (int loopCounter3 = 0; loopCounter3 < doubleArr.length; loopCounter3++)
        {
            for (int loopCounter4 = loopCounter3 + 1; loopCounter4 < doubleArr.length; loopCounter4++)
            {
                if (doubleArr [loopCounter3] > doubleArr [loopCounter4])
                {
                    double temp1 = doubleArr [loopCounter3];
                    doubleArr [loopCounter3] = doubleArr [loopCounter4];
                    doubleArr [loopCounter4] = temp1;
                }
            }
        }
    }

    public static void sortCharArr (char [] charArr)
    {
        for (int loopCounter3 = 0; loopCounter3 < charArr.length; loopCounter3++)
        {
            for (int loopCounter4 = loopCounter3 + 1; loopCounter4 < charArr.length; loopCounter4++)
            {
                if (charArr [loopCounter3] > charArr [loopCounter4])
                {
                    char temp2 = charArr [loopCounter3];
                    charArr [loopCounter3] = charArr [loopCounter4];
                    charArr [loopCounter4] = temp2;
                }
            }
        }
    }
}
