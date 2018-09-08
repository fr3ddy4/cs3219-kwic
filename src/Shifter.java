import java.util.List;

public interface Shifter {
    /**
     * Shifts lines
     */
    void shift();

    /**
     * Retrieves characters list
     *
     * @return list of strings
     */
    List<String> getLines();
}
