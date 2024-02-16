package AuxPackage;

/**
  * Name: Anupama Bhatta
  * Date: 11/19/2018
  * Description: Class that contains static methods to validate values.
  */

public class AuxValidator {
   
    public static boolean isNumber(String sValue)
    {
        boolean status = true;
        if (sValue.length() < 1)
            return false;
        
        sValue = sValue.replace("$", "");
        sValue = sValue.replace(" ", "");
        
            int iCount = 0;
            while (iCount < sValue.length())
            {
                char c = sValue.charAt(iCount);
                if (!Character.isDigit(c) && c != '.' )
                {
                    status = false;
                    break;
                }
                
                iCount++;
            }
            return status;
    }
    
    
    public static boolean isInt(String sValue)
    {
        boolean status = true;
        if (sValue.length() < 1)
            return false;
        
        sValue = sValue.replace("$", "");
        sValue = sValue.replace(" ", "");
        
        try 
        {
            int iInt = Integer.parseInt(sValue);
            return true;
        }
        catch(Exception ex)
        {
            return false;
        }
    }
}
