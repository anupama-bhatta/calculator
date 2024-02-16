
/**
  * Name: Anupama Bhatta
  * Date: 11/19/2018
  * Description: Class that contains different methods to format number.
  */

package AuxPackage;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AuxFormatter {
    public static String formatDate(Date dDate)
    {
        SimpleDateFormat format = new SimpleDateFormat("MM/DD/YYYY");
        
        String sDate = format.format(dDate);
        
        return sDate;
    }
    
    public static String formatPhone(long iPhone)
    {
        String sPhone = String.valueOf(iPhone);
        String firstThree = sPhone.substring(0,3);
        String middleThree = sPhone.substring(3,6);
        String lastDigits = sPhone.substring(6,sPhone.length());
        sPhone = "(" + firstThree + ")" + middleThree + "-" + lastDigits;
        return sPhone;
    }
    
    public static String formatSSN(int iSSN)
    {
        String sSSN = String.valueOf(iSSN);
        String firstThree = sSSN.substring(0,3);
        String middleTwo = sSSN.substring(3,6);
        String lastFour = sSSN.substring(5,sSSN.length());
        sSSN = firstThree + "-" + middleTwo + "-" + lastFour;
        return sSSN;
    }
    
    public static long stringToLong(String sValue)
    {
        sValue = sValue.replace("-","");
        sValue = sValue.replace("(","");
        sValue = sValue.replace(")","");
        sValue = sValue.replace(".","");
        sValue = sValue.replace(" ","");
        
        long iValue = Long.parseLong(sValue);
        return iValue;   
    }
    
    public static String formatPercent(double dVal)
    {
        NumberFormat format = NumberFormat.getPercentInstance();
        format.setMaximumFractionDigits(2);
        return format.format(dVal);
    }
    
    public static String formatNumber(double dVal)
    {
        return NumberFormat.getInstance().format(dVal);
    }
    
    public static String formatCurrency(double dVal)
    {
        NumberFormat frm = NumberFormat.getCurrencyInstance();
        
        return frm.format(dVal);
    }
    
    public static String formatNumberTwoDecimals(double dVal)
    {
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        return fmt.format(dVal);
    }
}

