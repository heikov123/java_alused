import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int numberOne = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int numberTwo = Integer.parseInt(reader.nextLine());

        System.out.println("The bigger number of the two numbers given was: " + Math.max(numberOne, numberTwo));
    }
}
