import java.util.Scanner;

public class Exercise47 {
    public static int calculateCharacters(String text) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int nameLength =  name.length();
        return nameLength;
    }

    public static void main(String[] args) {
        int nameLength = calculateCharacters("type your name to find out");
        System.out.print("Number of characters: " + nameLength);
    }

}
