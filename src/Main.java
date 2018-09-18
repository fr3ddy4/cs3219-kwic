/**
 * @author A0193543B
 * @author A0193208E
 * @author A0193145E
 * Main class with the entry point
 */
public class Main {
    public static void main(String[] args) {
        Input inputReader = new FileInput("input.txt");
        Input ignoreReader = new FileInput("ignore.txt");
        Input requiredReader = new FileInput("required.txt");
        Output output = new FileOutput("output.txt");
        Characters characters = new KWICCharacters(inputReader.read(), ignoreReader.read(), requiredReader.read());
        Shifter shifter = new CircularShifter(characters);
        shifter.shift();
        Sorter sorter = new AlphabeticSorter();
        sorter.sort(shifter.getLines());
        output.write(sorter.getLines());
    }
}