import java.util.Collections;
import java.util.List;

public class AlphabeticSorter implements Sorter {
    private List<String> lines;

    @Override
    public void sort(List<String> lines) {
        Collections.sort(lines);
        this.lines = lines;
    }

    @Override
    public List<String> getLines() {
        return lines;
    }
}
