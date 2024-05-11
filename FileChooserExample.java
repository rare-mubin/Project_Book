import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileChooserExample {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String projectPath = System.getProperty("user.dir");
            Path sourcePath = Paths.get(selectedFile.getAbsolutePath());
            Path destinationPath = Paths.get("image\\profile\\", selectedFile.getName());

            try {
                Files.copy(sourcePath, destinationPath);
            } catch (IOException e) {
                System.err.println("Error copying file: " + e.getMessage());
            }
        }
    }
}