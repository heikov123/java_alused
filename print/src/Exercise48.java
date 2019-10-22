import java.util.Scanner;

public class Exercise48 {
    public static char firstCharacter() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        char firstChar = name.charAt(0);
        return firstChar;
    }

    public static void main(String[] args) {
        char firstChar = firstCharacter();

        System.out.print("First character: " + firstChar);

    }
}
