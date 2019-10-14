import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Up to what number? ");
        int number = Integer.parseInt(reader.nextLine());
        int until = 1;

        while (number >= until) {
            System.out.println(until);
            until++;
        }
    }
}
