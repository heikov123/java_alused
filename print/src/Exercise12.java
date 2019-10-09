import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String nameOne = reader.nextLine();
        System.out.print("Type your age: ");
        int ageOne = Integer.parseInt(reader.nextLine());

        System.out.print("Type your name: ");
        String nameTwo = reader.nextLine();
        System.out.print("Type your age: ");
        int ageTwo = Integer.parseInt(reader.nextLine());

        int ageTotal = ageOne + ageTwo;

        System.out.print(nameOne + " and " + nameTwo + " are " + ageTotal + " years old in total.");
    }
}
