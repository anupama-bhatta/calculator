
/* 
    Author: Anupama Bhatta
    Date: 01/16/2018
    Description: Program that presents Heart Rate Calculator and BMI Calculator to the user to interact with.
*/
package MainPackage;

import java.awt.Color;
import java.text.NumberFormat;

public class CalculatorBMI {
    
    final int INCHES_FEET_INDEX = 12;
    final int BMI_INDEX = 703;
    
    private double dWeight; 
    private double iFeet; 
    private double iInches; 
    private double dBMI; 
    private Color colorConclusion;

    public CalculatorBMI(double dWeight, double iFeet, double iInches) 
    {
        this.dWeight = dWeight;
        this.iFeet = iFeet;
        this.iInches = iInches;
        this.dBMI = dBMI;
        this.dBMI = (dWeight / ((this.INCHES_FEET_INDEX * iFeet + iInches) * (this.INCHES_FEET_INDEX * iFeet + iInches))) *this.BMI_INDEX;
        setColorConclusion(dBMI);
    }
   

    public double getdWeight() {
        return dWeight;
    }

    public void setdWeight(double dWeight) {
        this.dWeight = dWeight;
    }

    public double getiFeet() {
        return iFeet;
    }

    public void setiFeet(double iFeet) {
        this.iFeet = iFeet;
    }

    public double getiInches() {
        return iInches;
    }

    public void setiInches(double iInches) {
        this.iInches = iInches;
    }

    public Color getColorConclusion() {
        return colorConclusion;
    }

    public double getdBMI() {
        return dBMI;
    }

    public String toString() {
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(2);
        return "Your BMI (Body Mass Index): " + format.format(dBMI);
    }

    public String getConclusion()
    {
        String sOutput = "";
        if (this.dBMI < 18.5){
                sOutput = "You are underweight. Consider increasing your calorie intake.";   
        } else if (this.dBMI >= 18.5 && this.dBMI <= 24.99){
                sOutput = "Your weight is normal. No diet change is necessary."; 
        } else if (this.dBMI >= 25 && this.dBMI <= 29.99){
                sOutput = "You are overweight. Reducing your calorie intake is necessary."; 
        } else if (this.dBMI >= 30){
                sOutput = "You are obese! Reducing your calorie intake is CRITICAL.";
        }
        return sOutput;
    }
    
    private void setColorConclusion(double dBMI)
    {
        if (this.dBMI < 18.5){
            colorConclusion = Color.CYAN;
        } else if (this.dBMI >= 18.5 && this.dBMI <= 24.99){
            colorConclusion = Color.GREEN;
        } else if (this.dBMI >= 25 && this.dBMI <= 29.99){
            colorConclusion = Color.MAGENTA;
        } else if (this.dBMI >= 30){
            colorConclusion = Color.RED;
        }    
    }
}
