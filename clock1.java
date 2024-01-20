import java.awt.*;
import javax.swing.*;
import java.util.*;

public class clock1 extends JPanel {
    public clock1(){
        int width = 200; //width of the color;
        JFrame clocks_frame = new JFrame();
        clocks_frame.getContentPane().add(this);
        clocks_frame.setTitle("Clock");
        clocks_frame.setSize(width, width);
        clocks_frame.setVisible(true);
    }

    public void paintComponent(Graphics g){
        GregorianCalendar time = new GregorianCalendar();
        int minutes_angle = 90 - (time.get(Calendar.MINUTE) * 6);
        int hours_angle = 90 - (time.get(Calendar.HOUR) * 30);
        int left_edge = 20;
        int top = 20;
        int diameter = 800;
        g.setColor(Color.white);
        g.setColor(Color.red);
        g.drawOval(left_edge, top, diameter, diameter);
        g.setColor(Color.black);
        g.fillArc(left_edge + 5, top + 5, diameter - 10, diameter - 10, minutes_angle, 5);
        g.setColor(Color.blue);
        g.fillArc(left_edge + 25, top + 25, diameter - 50, diameter - 50, hours_angle, -8);
    }

    public static void main(String[] args){
        new clock1();
    }
}
