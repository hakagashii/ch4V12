import java.awt.*;
import javax.swing.*;

public class PanelMitString extends JPanel {
    public void paintComponent(Graphics g){
        g.setColor(Color.blue);
        g.drawString("Hello people!", 30 , 80);
    }
}
