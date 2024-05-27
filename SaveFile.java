import java.io.FileWriter;
import java.io.IOException;

public class SaveFile {
    private FileWriter writer;
    public SaveFile(OpenFile location ,String newText){
        try {
            writer = new FileWriter(location.getCurrentFile());
            writer.write(newText);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
