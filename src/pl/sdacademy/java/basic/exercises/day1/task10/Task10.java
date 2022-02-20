package pl.sdacademy.java.basic.exercises.day1.task10;

public class Task10 {
    public static void main(String[] args) {
        int number = 123;
        int result = sumOfDigits(number);
        System.out.println("Sum:" + result);

    }

    private static int sumOfDigits(int number){
        int sum = 0;
        while ( number != 0 ){
            sum += number % 10;
            number /= 10;

        }
        return sum;

    }
}
