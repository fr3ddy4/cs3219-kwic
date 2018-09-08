import java.util.List;

public interface Characters {
    /**
     * Sets characters list
     *
     * @param characters to be set
     */
    void setCharacters(List<String> characters);

    /**
     * Retrieves characters list
     *
     * @return list of strings
     */
    List<String> getCharacters();
}
