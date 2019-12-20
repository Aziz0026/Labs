import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum = 0;
        int i = 0;

        int input;
        do {
            input = scan.nextInt();
            sum += input;
            i++;
        } while (input != 0);

        i--;

        if (i == 0) {
            System.out.printf("No to calculate");
        } else {
            double mean = (double) sum / i;
            System.out.printf("The arithmetic mean is equal to: %.1f%n", mean);
        }

    }
}
