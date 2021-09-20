import java.io.*;

public class FileReadAndWrite {
    public static void main (String [] args)
    {
        BufferedWriter bufferWriterObj = null;
        FileWriter writerObj = null;

        try
        {
            File fileObj = new File ("C:\\Users\\Susobhan\\Desktop\\Choto_mama\\Nov15\\StudentDetails.txt");
            FileReader readerObj = new FileReader (fileObj);
            BufferedReader bufferObj = new BufferedReader (readerObj);

            File fileObjOutput = new File ("C:\\Users\\Susobhan\\Desktop\\Choto_mama\\Nov15\\Writer.txt");
            writerObj = new FileWriter (fileObjOutput);
            bufferWriterObj = new BufferedWriter (writerObj);

            String lineString = "";
            int counter = 0;

            while ((lineString = bufferObj.readLine ()) != null)
            {
                bufferWriterObj.write (lineString);
                bufferWriterObj.write ("\n");
                counter++;
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace ();
        }
        finally
        {
            try
            {
                bufferWriterObj.close ();
                writerObj.close ();
            }
            catch (Exception ex)
            {
                ex.printStackTrace ();
            }
        }
    }
}


