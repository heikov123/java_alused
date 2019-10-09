import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the radius: ");
        int num = Integer.parseInt(reader.nextLine());

        double circle = (double) (2 * Math.PI * num);
        System.out.print(circle);

    }
}
