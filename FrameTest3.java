import javax.swing.*;
import java.awt.*;


public class FrameTest3 {
    public static void main(String[] args){
        JFrame my_frame = new JFrame();
        my_frame.getContentPane().add(new myPanel());
        my_frame.setTitle("MyFrameWriter");
        int frame_width = 400;
        int frame_height = 400;
        my_frame.setSize(frame_width, frame_height);
        my_frame.setVisible(true);
        System.out.println("Frame has appeared!");
    }
}
