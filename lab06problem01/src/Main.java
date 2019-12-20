import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Your coordinate: ");
        int coordinate = scan.nextInt();
        System.out.print("Coordinate of the 1'st point: ");
        int point1 = scan.nextInt();
        System.out.print("Coordinate of the 2'nd point: ");
        int point2 = scan.nextInt();

        int distance1 = abs(coordinate - point1);
        int distance2 = abs(coordinate - point2);

        if (distance1 < distance2) {
            System.out.printf("The 1'st point is closer. THe distance is %d.%n", distance1);
        } else if (distance2 < distance1) {
            System.out.printf("The 2'st point is closer. THe distance is %d.%n", distance2);
        } else {
            System.out.printf("The 1'st and the 2'nd points are equal distance %d.%n", distance1);
        }
    }

    static int abs(int number) {
        return number < 0 ? -number : number;
        //if(number < 0) {
        //   number *= -1;
        // }
        // return number

    }
}

