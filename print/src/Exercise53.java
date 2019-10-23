import java.util.Scanner;

public class Exercise53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.println("Length of the first part: ");
        int wordLength = Integer.parseInt(reader.nextLine());

        String result = word.substring(0, wordLength);

        System.out.println(result);
    }
}
