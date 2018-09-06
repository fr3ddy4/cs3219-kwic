import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CircularShifter implements Shifter {
    private List<String> characters;

    public CircularShifter(List<String> characters) {
        this.characters = characters;
    }

    @Override
    public void shift() {
        List<String> result = new LinkedList<>();
        for (String line : characters) {
            String words[] = line.split(" ");
            for (int i = 0; i < words.length; ++i) {
                words = shiftWords(words);
                result.add(Arrays.toString(words));
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
}
