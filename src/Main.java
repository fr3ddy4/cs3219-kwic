public class Main {
    public static void main(String[] args) {
        Input input = new FileInput("input.txt");
        Output output = new FileOutput("output.txt");
        Characters characters = new KWICCharacters(input.read());
    }
}
