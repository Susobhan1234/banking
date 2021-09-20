import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReadAndPrint {
    public static void main (String [] args)
    {
        try
        {
            File fileObj = new File ("C:\\Users\\Susobhan\\Desktop\\Choto_mama\\Nov15\\StudentDetails.txt");
            FileReader readerObj = new FileReader (fileObj);
            BufferedReader bufferObj = new BufferedReader (readerObj);

            String lineString = "";
            int counter = 0;

            while ((lineString = bufferObj.readLine ()) != null)
            {
                String [] arr = lineString.split (",");

                String rollno = arr [0];
                String name = arr [1];
                String subject = arr [2];
                String number = arr [3];

                System.out.println("Roll no : " + rollno + "\tName : " + name + "\tSubject : " + subject + "\tNumber : " + number);
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace ();
        }
    }
}
