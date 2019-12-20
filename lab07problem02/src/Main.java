import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year? ");
        int year = scanner.nextInt();

        System.out.print("Month? ");
        int month = scanner.nextInt();

        int result = getDaysOfMonth(year, month);
        if (result == -1) {
            System.out.println("Invalid month number");
        } else {
            System.out.printf("Number of days: %d%n", result);
        }
    }

    static int getDaysOfMonth(int year, int month) {
        if (month < 1 || month > 12){
            return -1;
        }

        int[] days = {
                  31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
               // 1    2   3   4  5   6   7   8   9   10  11 12: monthly number
               // 0   1   2   3   4   5   6   7   8    9  10 11: array indices
       };

       int result = days[month -1];
       if (month == 2 && isLeapYear(year)){
           result++;
       }

        return result;
    }

    static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}

