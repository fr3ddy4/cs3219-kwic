import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Represents a file output
 */
public class FileOutput implements Output {

    private PrintWriter writer;

    FileOutput(String filename) {
        try {
            writer = new PrintWriter(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write(List<String> lines) {
        for (String line : lines) {
            writer.println(line);
        }
        writer.close();
    }
}
