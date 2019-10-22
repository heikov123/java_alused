import java.util.Scanner;

public class Exercise49 {
    public static char lastCharacter() {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int nameLength = name.length() -1;
        char lastChar = name.charAt(nameLength);
        return lastChar;
    }

    public static void main(String[] args) {
        char lastChar = lastCharacter();

        System.out.print("Last character: " + lastChar);
    }
}
