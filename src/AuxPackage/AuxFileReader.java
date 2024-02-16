
package AuxPackage;

import java.io.File;
import java.util.Scanner;

/**
  * Name: Anupama Bhatta
  * Date: 11/19/2018
  * Description: Class that contains convenient methods that simplifies working with files.
*/
public class AuxFileReader 
{
    public static String[] readFileReturnStringArray(String sFile)
    {
       
        Scanner scan = null;
        int iRowCount = getFileRowCount(sFile);
        
        if (iRowCount==0) // performs the check to make sure the file is read and has data
        {
               System.err.print("There was a problem reading the file or the file did not have any records."); // displays error related to the file
               return null;
        }
        
        String[] arRows = new String[iRowCount]; // instantiates the array of the correct length 
         
        try
        { 
           File myFile = new File(sFile);
           scan = new Scanner(myFile); // loads the file into the Scanner object
        }
        catch(Exception ex)
        {
            System.err.print(ex.getMessage()); // displays error related to the file
        }
        
        iRowCount = 0; // sets the loop counter to zero
        if (scan!=null) // performs the check and make sure the scanner is not null. If it is null then the file was not read properly.
        {
            while (scan.hasNext()) 
            { 
                arRows[iRowCount] = scan.nextLine();
                iRowCount++;
            }
        }
        else
        {
             System.err.print("There was a problem reading the file."); //display error related to the file
        }
       return arRows; 
    }
    
    
    public static int getFileRowCount(String sFile)
    {
        File myFile = null;
        Scanner scan = null;
        int iCount = 0;
        try
        {
           myFile = new File(sFile);
           scan = new Scanner(myFile);
        }
        catch(Exception ex)
        {
            System.err.print(ex.getMessage()); // displays error related to the file
        }
        while (scan.hasNext()) 
        {
            scan.nextLine();
            iCount++;
        }
        return iCount;
    }
}
