import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Window {
    private JFrame frame = new JFrame();
    private JTextArea editArea = new JTextArea();
    public Window(){

    }
    public Window(boolean editor){
        
        
        if (editor){          
            frame.add(editArea);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

        
        
    }
    public void createWindow(String name, int width, int height){
        frame.setTitle(name);
        frame.setSize(width,height);
        frame.setVisible(true);
    }
    public void setTextArea(String txt){
        editArea.setText(txt);
    }
}
