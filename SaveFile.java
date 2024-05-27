import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {
    private FileWriter writer;
    public SaveFile(){
        OpenFile location = new OpenFile();
        Window newText = new Window();
        try {
            writer = new FileWriter(location.getCurrentFile());
            writer.write(newText.getNewText());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
