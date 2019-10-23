import java.util.Scanner;

public class Exercise52 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        String reverse = "";

        for (int i = name.length() -1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }
        System.out.print("Your name reversed: " + reverse);

    }
}
