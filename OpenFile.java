import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class OpenFile {
    private File currentFile;
    private Scanner scan;

    public String getFile() {
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(fc);
        try {
            currentFile = new File(fc.getSelectedFile().getAbsolutePath());
            scan = new Scanner(currentFile);
            String file = "";
            while (scan.hasNextLine()) {
                file += scan.nextLine() + "\n";
            }
            scan.close();
            return file;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        return "";
    }

    public File getCurrentFile() {
        return currentFile;
    }

}
