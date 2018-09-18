import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Represents circular shifter
 */
public class CircularShifter implements Shifter {
    private List<String> characters, ignore, required;

    public CircularShifter(Characters characters) {
        this.characters = characters.getCharacters();
        this.ignore = characters.getIgnore();
        this.required = characters.getRequired();
    }

    @Override
    public void shift() {
        List<String> result = new LinkedList<>();
        for (String line : characters) {
            String words[] = line.split(" ");
            for (int i = 0; i < words.length; ++i) {
                words = shiftWords(words);
                if (!containsCaseInsensitive(ignore, words[0])) {
                    // If required set is empty we only consider ignore words assuming all words are required
                    if (required.size() > 0) {
                        if (containsCaseInsensitive(required, words[0])) {
                            result.add(Arrays.toString(words));
                        }
                    } else {
                        result.add(Arrays.toString(words));
                    }
                }
            }
        }
        characters = result;
    }

    @Override
    public List<String> getLines() {
        return characters;
    }

    private String[] shiftWords(String words[]) {
        String result[] = new String[words.length];
        result[0] = words[words.length - 1];
        System.arraycopy(words, 0, result, 1, words.length - 1);
        return result;
    }

    private boolean containsCaseInsensitive(List<String> list, String word){
        for (String string : list){
            if (string.equalsIgnoreCase(word)){
                return true;
            }
        }
        return false;
    }

}