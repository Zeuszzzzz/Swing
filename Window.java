import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JPanel;

public class Window {
    private JFrame frame;
    private JTextArea editArea = new JTextArea();
    private Menubar bar;
    private JPanel panel = new JPanel();
    public Window(String name, int width, int height){
        frame = new JFrame(name);
        frame.setSize(width,height);
        
        panel.setLayout(null);
        editArea.setBounds(0, 21, width, height);
        panel.add(editArea);
        bar = new Menubar(panel , editArea, width, getNewText());
        

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public String getNewText(){
       return editArea.getText();
    }
    
}
