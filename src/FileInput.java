import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileInput implements Input {
    private String filename;

    FileInput(String filename) {
        this.filename = filename;
    }

    @Override
    public List<String> read() {
        try {
            return Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
