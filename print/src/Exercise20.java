import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your username: ");
        String userOne = reader.nextLine();

        System.out.print("Type your password: ");
        String passwordOne = reader.nextLine();

        if (userOne.equals("alex") && passwordOne.equals("mightyducks") || userOne.equals("emily") && passwordOne.equals("dog")) {
            System.out.print("You are logged into the system!");
        } else {
            System.out.print("Your username or password was invalid");
        }
    }
}
