import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OpenFile {
    private File currentFile;
    private Scanner scan;
    public OpenFile(){
        
    }
    public String getFile(){
        try{
            currentFile = new File("C:\\Users\\Ravi\\Desktop\\Java\\example.txt");
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
            error.createWindow("Text Editor", 1000, 1000);
        }
        return "";
    }
}
