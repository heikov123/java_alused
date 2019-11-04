import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise60 {
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
        Collections.sort(words);

        System.out.print("Words in order: ");
        for (String wordd : words) {
            System.out.println(wordd);
        }
    }
}
