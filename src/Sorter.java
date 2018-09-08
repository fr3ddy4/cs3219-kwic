import java.util.List;

public interface Sorter {
    /**
     * Sorts lines
     * @param lines to be sorted
     */
    public void sort(List<String> lines);

    /**
     * Returns lines
     * @return list of lines
     */
    public List<String> getLines();
}
