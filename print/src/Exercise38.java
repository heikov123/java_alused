import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How many? ");
        int count = Integer.parseInt(reader.nextLine());

        while (count > 0) {
            printText();
            count--;
        }
    }

    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }
}
