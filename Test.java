import java.text.*;
import javax.swing.*;


public class Test {
    public static void main(String[] args){
     String nr = JOptionPane.showInputDialog("Write down a number: ");
     int nr1 = new Integer(nr).intValue();

     double squareNr1 = Math.pow(nr1, 2);

     JOptionPane.showMessageDialog(null, nr1 + " its square is " + squareNr1);
    }
}
