import java.util.List;

/**
 * Represents characters
 */
public class KWICCharacters implements Characters {
    private List<String> characters, ignore, required;

    KWICCharacters(List<String> characters, List<String> ignore, List<String> required) {
        this.characters = characters;
        this.ignore = ignore;
        this.required = required;
    }

    @Override
    public void setCharacters(List<String> characters) {
        this.characters = characters;
    }

    @Override
    public List<String> getCharacters() {
        return this.characters;
    }

    @Override
    public List<String> getIgnore() {
        return ignore;
    }

    @Override
    public List<String> getRequired() {
        return required;
    }
}