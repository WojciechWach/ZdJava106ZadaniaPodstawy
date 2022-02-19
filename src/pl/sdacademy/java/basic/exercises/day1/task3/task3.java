package pl.sdacademy.java.basic.exercises.day1.task3;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert first digit: ");
        int x = scanner.nextInt();

        System.out.print("Please insert second digit: ");
        int y = scanner.nextInt();

        boolean PointA = methodForPointA(x, y);
        System.out.println(" If x is graeter than y: " + PointA);

        boolean PointB = methodForPointA(x, y);
        System.out.println(" If x * 3 is greater than y: " + PointB);

        boolean PointC = methodForPointA(x, y);
        System.out.println(" If y++ is smaller than ++x is smallerr than y++ " + PointC);

    }
    private static boolean methodForPointA(int x, int y ){
        return x > y;
    }

    private static boolean methodForPointB(int x, int y) {
        return (x * 3) > y;
    }
        private static boolean methodForPointC ( int x, int y ) {
            return ( y++ < ++x ) && (--x < y++);
        }

}
