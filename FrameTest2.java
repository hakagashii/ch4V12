import javax.swing.*;


public class FrameTest2 {
    public static void main(String[] args){
        TestPanel sample_panel = new TestPanel();
        JFrame sample_frame = new JFrame();
        sample_frame.getContentPane().add(sample_panel);
        sample_frame.setSize(300, 200);
        sample_frame.setVisible(true);
        System.out.println("Frame has appeared!");
    }
}
