import java.text.*;
import javax.swing.*;

public class TempCtoF{
    public static void main(String[] args){ 
        String input = JOptionPane.showInputDialog("Shkruaj nje numer, temperaturen ne Celsius: ");
        int c = new Integer(input).intValue();
        double f = ((9.0 / 5.0) * c ) + 32;
        DecimalFormat formatter = new DecimalFormat("0.0");
        System.out.println("Per grade Celsius " + c + " ,");
        System.out.println("Grade Fahrenheit = " + formatter.format(f));
    }
}
