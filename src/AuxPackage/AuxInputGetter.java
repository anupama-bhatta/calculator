package AuxPackage;

import java.util.Scanner;

/**
  * Name: Anupama Bhatta
  * Date: 11/19/2018
  * Description: Class is designed to get various input from user.
  */

public class AuxInputGetter {
    
    public static double getNumberFromUser(String sQuestion)
    {
        
        Scanner scan = new Scanner(System.in);
        System.out.print(sQuestion);
        
        String sVal = scan.nextLine();
        while (!AuxValidator.isNumber(sVal))
        {
                System.out.println("===================Invalid number===================\n" + sQuestion);
                sVal = scan.nextLine();
        }
        double num = Double.parseDouble(sVal);
        
        return num;
    }

    public static int getIntFromUser(String sQuestion)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print(sQuestion);
        
        String sVal = scan.nextLine();
        while (!AuxValidator.isInt(sVal))
        {
                System.out.println("===================Invalid number===================\n" + sQuestion);
                sVal = scan.nextLine();
        }
        int num = Integer.parseInt(sVal);
        
        return num; 
    }

}
