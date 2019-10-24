import java.util.ArrayList;
import java.util.Scanner;

public class Exercise57 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        words.add(word);

        while(word.length() > 0) {
            System.out.print("Type a word: ");
            word = reader.nextLine();
            words.add(word);
        }


        System.out.println("You typed following words: ");

        for (String wordd : words) {
            System.out.println(wordd);
        }

    }
}
