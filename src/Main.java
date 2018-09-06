public class Main {
    public static void main(String[] args) {
        Input input = new ALFileInput("input.txt");
        Output output = new ALFileOutput("output.txt");
        Characters characters = new KWICCharacters(input.read());
    }
}
