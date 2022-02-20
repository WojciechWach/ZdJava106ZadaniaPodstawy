package day2.task1;

public class task1 {
    public static void main(String[] args) {
        String input = "ala";
        System.out.println("Orginal word " + input);
        System.out.println("last char: " + getLastFromString(input));

        input = "domek";
        System.out.println("Orginal word " + input);
        System.out.println("last char:  " + getLastFromString(input));
    }
    private static char getLastFromString(String input) {
        int lastPosition = input.length() - 1;
        return input.charAt(lastPosition);
    }


}
