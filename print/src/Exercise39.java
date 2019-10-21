import java.util.Scanner;

public class Exercise39 {
    public static void printStars(int amount) {
        int i = 0;

        while (i  < amount) {
            i++;
            System.out.print("*");
        } if (i >= amount) {
            System.out.println("");
        }

    }

    public static void printSquare(int sideSize) {
        int i = 0;

        while (i < sideSize) {
            i++;
            printStars(sideSize);
        }
    }

    public static void printRectangle(int width, int height) {
        int i = 0;
        int x = 0;

        while (i < height) {
            i++;
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        int i = 0;

        while (i < size) {
            i++;
            printStars(i);
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("");
        printSquare(4);
        System.out.println("");
        printRectangle(17, 3);
        System.out.println("");
        printTriangle(4);
    }
}
