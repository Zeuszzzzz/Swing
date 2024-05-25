public class Main {
    public static void main(String[] args){
        OpenFile File = new OpenFile();
        Window window = new Window(true);
        window.setTextArea(File.getFile());
        window.createWindow("Text Editor", 1000, 1000);
    }
}