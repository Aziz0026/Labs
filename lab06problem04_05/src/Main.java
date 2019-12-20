import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("A = ");
        int a = scan.nextInt();
        System.out.print("B = ");
        int b = scan.nextInt();

        int result = Euclid_gcd(a, b);
        if (result == 0) {
            System.out.printf("GCD(%d, %d) is not defined.%n", a, b);
        } else {
            System.out.printf("GCD(%d, %d) = %d%n", a, b, result);
        }
    }

    static int gcd(int a, int b) {
        if (a == 0 && b == 0) {
            return 0; // bad approach, exceptions are much better
        } else if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }
        int gcd = Math.min(a, b);
        while (a % gcd != 0 || b % gcd != 0) {
            gcd--;
        }
        return gcd;
    }

    static int Euclid_gcd(int a, int b) {
        if (a == 0 && b == 0) {
            return 0; // bad approach, exceptions are much better
        } else if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        }

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}