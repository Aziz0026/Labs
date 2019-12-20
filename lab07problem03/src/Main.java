import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the list of numbers: ");
        int[] numbers = readNumbers(scan);

        System.out.println("Before: ");
        printNumbers(numbers);

        reverseNumbers(numbers);

        System.out.println("After: ");
        printNumbers(numbers);
    }

    static void reverseNumbers(int[] numbers){
        for (int i = 0, j = numbers.length - 1; i < j; i++, j--){
            int temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;

        }
    }

    static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i != numbers.length - 1 ? " " : "\n"));
        }
        //            System.out.print(numbers[i]);
//            if (i != numbers.length - 1){
//                System.out.print(" ");
//            } else {
//                System.out.print("\n");
//            }
    }

    static int[] readNumbers(Scanner scan) {
        String line = scan.nextLine().trim();
        if (line.length() == 0){return new int [0]; }

        String[] parts = line.split(" ");
        int[] numbers = new int[parts.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        return numbers;
    }
}
