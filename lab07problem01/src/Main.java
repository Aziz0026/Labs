import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of throws: ");
        long throwCount = scan.nextLong();

        int[] sums = new int [11];

//        int sum2 = 0;
//        int sum3 = 0;
//        int sum4= 0;
//        int sum5 = 0;
//        int sum6 = 0;
//        int sum7 = 0;
//        int sum8 = 0;
//        int sum9 = 0;
//        int sum10 = 0;
//        int sum11 = 0;
//        int sum12 = 0;

        for (int i = 0; i < throwCount; i++){
            int die1 = random(1, 6);
            int die2 = random(1, 6);
            int sum = die1 + die2;

            sums[sum - 2]++;

//            switch (sum){
//                case 2:
//                    sum2++;
//                    break;
//                case 3:
//                    sum3++;
//                    break;
//                case 4:
//                    sum4++;
//                    break;
//                case 5:
//                    sum5++;
//                    break;
//                case 6:
//                    sum6++;
//                    break;
//                case 7:
//                    sum7++;
//                    break;
//                case 8:
//                    sum8++;
//                    break;
//                case 9:
//                    sum9++;
//                    break;
//                case 10:
//                    sum10++;
//                    break;
//                case 11:
//                    sum11++;
//                    break;
//                case 12:
//                    sum12++;
//                    break;
//            }
//
        }
//        System.out.printf("2: %d%n", sum2);
//        System.out.printf("2: %d%n", sum3);
//        System.out.printf("2: %d%n", sum4);
//        System.out.printf("2: %d%n", sum5);
//        System.out.printf("2: %d%n", sum6);
//        System.out.printf("2: %d%n", sum7);
//        System.out.printf("2: %d%n", sum8);
//        System.out.printf("2: %d%n", sum9);
//        System.out.printf("2: %d%n", sum10);
//        System.out.printf("2: %d%n", sum11);
//        System.out.printf("2: %d%n", sum12);
        for (int i = 0; i < sums.length; i++){
            System.out.printf("%d: %d%n", i + 2, sums[i]);
        }
    }

    static int random(int min, int max){
        return (int) (min + Math.random() * (max - min + 1));
    }
}
