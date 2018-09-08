import java.util.List;

/**
 * Represents the alphabetical sorter
 */
public class AlphabeticSorter implements Sorter {
    private List<String> lines;

    @Override
    public void sort(List<String> lines) {
        lines.sort(String.CASE_INSENSITIVE_ORDER);
        this.lines = lines;
    }

    @Override
    public List<String> getLines() {
        return lines;
    }
}
