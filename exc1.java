import java.text.*;
import javax.swing.*;


public class exc1 {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("Write down your name: ");
        String age = JOptionPane.showInputDialog("How old are you? ");

        int agE = new Integer(age).intValue();
        System.out.println("Hello " + name + " You " + agE + " years old pop!");
    }
}
