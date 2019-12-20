import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long number = scan.nextInt();

        long sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.printf("The sum of all digits is %d", Math.abs(sum));
    }
}
