public class SearchingOperations {
    public static void main (String [] args)
    {
        /*-----------------For searching an integer in an integer array-----------------*/
        int [] intArray = new int [3];
        intArray [0] = 5;
        intArray [1] = 4;
        intArray [2] = 3;
        int searchingNumber = 8;
        boolean returnValue = searchInt (intArray, searchingNumber);

        if (returnValue == true)
        {
            System.out.println ("Searched number found");
        }
        else {
            System.out.println ("Searched number not found");
        }

        /*-----------------For searching double in a double array-----------------*/
        double [] doubleArr = new double [3];
        doubleArr [0] = 1.2;
        doubleArr [1] = 0.2;
        doubleArr [2] = 10.2;
        double searchingDouble = 1.2;
        boolean returnValue2 = searchDouble (doubleArr, searchingDouble);

        if (returnValue2 == true)
        {
            System.out.println ("Searched double value found");
        }
        else {
            System.out.println ("Searched double value not found");
        }

        /*-----------------For searching a char in a char array-----------------*/
        char [] charArr = new char [3];
        charArr [0] = 'a';
        charArr [1] = 'A';
        charArr [2] = 'S';
        char searchingChar = 's';
        boolean returnValue3 = searchChar (charArr, searchingChar);

        if (returnValue3 == true)
        {
            System.out.println ("Searched char value found");
        }
        else {
            System.out.println ("Searched char value not found");
        }

        /*-----------------For searching a string in a string array-----------------*/
        String [] stringArr = new String [4];
        stringArr [0] = "Susobhan";
        stringArr [1] = "Masanta";
        stringArr [2] = "computer";
        stringArr [3] = "Science";
        String searchingString = "Ssobhan";
        boolean returnValue4 = searchString (stringArr, searchingString);

        if (returnValue4 == true)
        {
            System.out.println ("Searched string value found");
        }
        else {
            System.out.println ("Searched string value not found");
        }
    }

    public static boolean searchInt (int [] whereToSearch, int whatToSearch)
    {
        for (int loopCounter1 = 0; loopCounter1 < whereToSearch.length; loopCounter1++)
        {
            if (whereToSearch [loopCounter1] == whatToSearch)
            {
                return true;
            }
        }

        return false;
    }

    public static boolean searchDouble (double [] whereToSearch, double whatToSearch)
    {
        for (int loopCounter1 = 0; loopCounter1 < whereToSearch.length; loopCounter1++)
        {
            if (whereToSearch [loopCounter1] == whatToSearch)
            {
                return true;
            }
        }

        return false;
    }

    public static boolean searchChar (char [] whereToSearch, char whatToSearch)
    {
        for (int loopCounter1 = 0; loopCounter1 < whereToSearch.length; loopCounter1++)
        {
            if (whereToSearch [loopCounter1] == whatToSearch)
            {
                return true;
            }
        }

        return false;
    }

    public static boolean searchString (String [] whereToSearch, String whatToSearch)
    {
        for (int loopCounter1 = 0; loopCounter1 < whereToSearch.length; loopCounter1++)
        {
            if (whereToSearch [loopCounter1].equals (whatToSearch))
            {
                return true;
            }
        }

        return false;
    }
}
