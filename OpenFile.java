import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class OpenFile {
    private File currentFile;
    private Scanner scan;
    public OpenFile(){
        
    }
    public String getFile(){
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(fc);
        try{
            currentFile = new File(fc.getSelectedFile().getAbsolutePath());
            scan = new Scanner(currentFile);
            String file = "";
            while(scan.hasNextLine()){
                file += scan.nextLine() + "\n";
            }
            scan.close(); 
            return file;
        }
        catch(FileNotFoundException e){
            Window error = new Window();
            error.createWindow("Error", 500, 150);
        }
        return "";
    }
    public File getCurrentFile(){
        return currentFile;
    }
    
}
