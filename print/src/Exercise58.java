import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise58 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        String theWord = "";

        while (theWord.isEmpty()) {
            System.out.print("Type a word: ");
            String output = reader.nextLine();

            if (words.contains(output)) {
                theWord += output;
            }
            words.add(output);
        }

        System.out.println("You typed the word " + theWord + " twice");
    }
}
