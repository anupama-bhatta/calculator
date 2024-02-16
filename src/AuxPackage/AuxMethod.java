package AuxPackage;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Name: Anupama Bhatta
 * Date: 11/19/2018
 * Description: Class that converts running time into seconds.
 */

public class AuxMethod {
    public static double DateDiffSeconds(Date startDate) {

    /** Today's date */
    Date today = new Date();

    // Get msec from each, and subtract.
    long diff = today.getTime() - startDate.getTime();
    
    double seconds = (double) diff / (double)(1000);
    seconds = Math.round(seconds*100)/100D;
    return seconds;
            
    }  
}
