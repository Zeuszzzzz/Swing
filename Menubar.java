import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menubar {
    private JMenuBar bar = new JMenuBar();
    private JMenu file = new JMenu("File");
    private JMenuItem open = new JMenuItem("Open");
    private JMenuItem save = new JMenuItem("Save");
    private ActionListener openListener;
    private ActionListener saveListener;
    private OpenFile File = new OpenFile();

    public Menubar(JPanel panel, JTextArea textarea, int width) {
        openListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textarea.setText(File.getFile());
            }
        };

        saveListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SaveFile saving = new SaveFile(File, textarea.getText());
            }
        };

        open.addActionListener(openListener);
        save.addActionListener(saveListener);

        file.add(open);
        file.add(save);
        bar.add(file);
        bar.setSize(width, 21);
        panel.add(bar);
    }
}
