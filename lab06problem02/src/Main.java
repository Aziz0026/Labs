import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Year? ");
        int year = scanner.nextInt();

        System.out.print("Month? ");
        int month = scanner.nextInt();

        int result = getDaysOfMonth(year, month);
        if (result == -1){
            System.out.println("Invalid month number");
        } else{
            System.out.printf("Number of days: %d%n", result);
        }
    }

    static int getDaysOfMonth(int year, int month) {
        int result;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            case 2:
                /*
                if (year % 4 == 0 && year & 100 != 0 || year % 400 == 0) {
                    result = "290";
                } else {
                    result = "28";
                }
                */

                result = isLeapYear(year) ? 29 : 28;
                break;

            default:
                result = -1; // old approach,  exceptions are much better
                break;
        }
        return result;
    }
    static boolean isLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
