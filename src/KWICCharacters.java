import java.util.List;

/**
 * Represents characters
 */
public class KWICCharacters implements Characters {
    private List<String> characters;

    KWICCharacters(List<String> characters) {
        this.characters = characters;
    }

    @Override
    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    @Override
    public List<String> getCharacters() {
        return this.characters;
    }
}
