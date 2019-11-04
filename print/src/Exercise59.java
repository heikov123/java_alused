import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise59 {
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
        ArrayList<String> words = new ArrayList<>();
        System.out.print("Type a word: ");
        String theWord = reader.nextLine();
        words.add(theWord);

        while (theWord.length() > 0) {
            System.out.print("Type a word: ");
            theWord = reader.nextLine();
            words.add(theWord);
        }

        System.out.println("Words you typed backwards: ");

        for (String wordd : words) {
            System.out.println(reverse(wordd));
        }




    }
}
