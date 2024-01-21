import java.awt.*;
import javax.swing.*;
/**Field Example displays how often a window is painted on the display */
public class FieldExample extends JPanel{
    private int count; /* this field variable holds the count of often the window has been painted; so its value must always be nonnegative. */
    /**FieldExample constructs the window*/
    public FieldExample(){
        count = 0;
        JFrame my_frame = new JFrame();
        my_frame.getContentPane().add(this);
        int height = 200;
        my_frame.setSize((3 * height)/2, height);
        my_frame.setVisible(true);
    }

    public void paintComponent(Graphics g){
        count = count + 1;
        g.setColor(Color.black);
        int margin = 25;
        int line_height = 20;
        int first_line = 40;
        int baseline = first_line + (line_height * count);
        g.drawString("Painted " + count + " times", margin, baseline);
    }

    public static void main(String[] args) {
        new FieldExample();
    }
}