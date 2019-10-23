import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int i = 0;

        for (i = 0; i < name.length(); i++) {
            if (i >= name.length()) {
                return;
            } else if (3 > name.length()) {
                return;
            }
            System.out.println(i + ". character: " + name.charAt(i));
        }
    }
}
