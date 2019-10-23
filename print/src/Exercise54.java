import java.util.Scanner;

public class Exercise54 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();
        int wordLength = word.length();

        System.out.println("Length of the end part: ");
        int wordEnd = Integer.parseInt(reader.nextLine());

        String result = word.substring(wordLength - wordEnd);

        System.out.println(result);
    }
}
