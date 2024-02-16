
package MainPackage;

import java.awt.Color;
import java.text.NumberFormat;

/* 
    Author: Anupama Bhatta
    Date: 01/16/2018
    Description: Program that presents Heart Rate Calculator and BMI Calculator to the user to interact with.
*/

public class CalculatorHR {
    
    final int BASE_NUM = 220;
    final int INTENSITY_BASE = 100;
    
    private int age;
    private int intensity;
    private int targetHeartRate;
    private Color colorIntensity;

    public CalculatorHR(int age, int intensity) {
        this.age = age;
        this.intensity = intensity;
        this.targetHeartRate = (BASE_NUM - age) * intensity/INTENSITY_BASE;
        setColorIntensity(intensity);
    }

    public int getTargetHeartRate() {
        return targetHeartRate;
    }

    public void setTargetHeartRate(int targetHeartRate) {
        this.targetHeartRate = targetHeartRate;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public Color getColorIntensity() {
        return colorIntensity;
    }

    @Override
    public String toString() {
        NumberFormat format = NumberFormat.getInstance();
        format.setMaximumFractionDigits(2);
        return "Target Heart Rate: " + format.format(targetHeartRate);
    }
    
    private void setColorIntensity(int intensity)
    {
        if (intensity<=50)
            colorIntensity = Color.CYAN;
        if (intensity>50 && intensity<=75)
            colorIntensity = Color.BLUE;
        if (intensity>75)
            colorIntensity = Color.RED;
    }
    
}
