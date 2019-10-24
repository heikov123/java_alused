import java.util.Scanner;

public class Exercise56 {
    public static String reverse(String text) {
        String help = "";
        int textLength = text.length();

        for (int i = textLength -1; i >= 0; i--) {
            help = help + text.charAt(i);
        }
        return help;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Write your text here: ");
        String text = reader.nextLine();
        System.out.println("Reversed text: " + reverse(text));

    }
}
