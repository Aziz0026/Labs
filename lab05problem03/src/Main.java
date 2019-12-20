import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int MIN_VALUE = 0;
        final int MAX_VALUE = 10;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of tests: ");
        int tests = scan.nextInt();

        int correctAnswers = 0;
        int incorrectAnswers = 0;

//        int i = 0;
//        while (i++ < tests)
//        while (tests-- > 0) {
//            int num1 = MIN_VALUE + random.nextInt(MAX_VALUE - MIN_VALUE + 1);
//            int num2 = MIN_VALUE + random.nextInt(MAX_VALUE - MIN_VALUE + 1);
//            int sum = num1 + num2;
//            System.out.printf("%d + %d = ", num1, num2);
//            int answer = scan.nextInt();
//            if (sum == answer) {
//                correctAnswers++;
//            } else {
//                incorrectAnswers++;
//            }
//            i++;
//        }

//        for (int i = 0; i < tests; i++)
        for (; tests-- > 0;) {
            int num1 = MIN_VALUE + random.nextInt(MAX_VALUE - MIN_VALUE + 1);
            int num2 = MIN_VALUE + random.nextInt(MAX_VALUE - MIN_VALUE + 1);
            System.out.printf("%d + %d = ", num1, num2);
            int answer = scan.nextInt();
            if (num1 + num2 == answer) {
                correctAnswers++;
            } else {
                incorrectAnswers++;
            }
        }


        System.out.printf(
                "Number of correct answers: %d%n" +
                        "Number of incorrect answers: %d%n",
                correctAnswers,
                incorrectAnswers
        );
    }
}
