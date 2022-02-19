package pl.sdacademy.java.basic.exercises.day1.task6;

public class task6 {
    public static void main(String[] args) {
        printMultiplicationTable(6,2,5);


    }
    private static void printMultiplicationTable(int multiplier, int minMultiplicand, int maxMiltiplicand) {

////        for (; minMultiplicand <= maxMiltiplicand; minMultiplicand++) {
////        int result = multiplier * minMultiplicand;
////        System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
//
//        }

        while (minMultiplicand <= maxMiltiplicand){
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
            minMultiplicand++;
        System.out.println(multiplier + " * " + minMultiplicand + " = " + result);
        }

    }

}

