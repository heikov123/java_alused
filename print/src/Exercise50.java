import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int i;

        for (i = 0; i < name.length(); i++) {
            if(i >= 3) {
                return;
            } else if ( name.length() < 3) {
                return;
            }
            System.out.println((i + 1) + ". character: " + name.charAt(i));
        }

    }
}
