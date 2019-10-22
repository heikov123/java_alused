public class Exercise46 {
    public static double avarage(int number1, int number2, int number3, int number4) {
        double sum = number1 + number2 + number3 + number4;
        double answer = sum / 4;
        return answer;

    }

    public static void main(String[] args) {
        double answer = avarage(4, 6, 3, 1);
        System.out.print("Avarage: " + answer);
    }
}
