import java.awt.*;
import javax.swing.*;

public class myPanel  extends JPanel{
    public void paintComponent(Graphics g){
        int frame_width = 300;
        int frame_height = 200;
        g.setColor(Color.yellow);
        g.fillRect(0, 0, frame_width, frame_height);
        g.setColor(Color.black);
        int left_edge = 210;
        int top = 140;
        //draw a rectangle 
        int width = 80;
        int height = 40;
        g.drawRect(left_edge, top, width, height);
        //draw a filled circle;
        int diameter = 40;
        g.fillOval(left_edge + width - diameter, top, diameter, diameter);
    }
    
}
