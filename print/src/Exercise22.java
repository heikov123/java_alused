import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("Type the password: ");
            String password = reader.nextLine();
            String secret = "The secret is: jryy qbar!";

            if (password.equals("carrot")) {
                System.out.println("Right!");
                System.out.println("");
                System.out.println(secret);
                break;
            } else {
                System.out.println("Wrong!");
            }
        }


    }
}
