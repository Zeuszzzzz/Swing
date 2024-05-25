import javax.swing.JFrame;
public class Window {
    private JFrame frame;
    public Window(String name, int width, int height){
        frame = new JFrame(name);
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
