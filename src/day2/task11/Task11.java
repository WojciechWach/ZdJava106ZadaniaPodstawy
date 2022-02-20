package day2.task11;

public class Task11 {
    public static void main(String[] args) {
        String input = "kajak";
        System.out.println(" Input : " + input);
        System.out.println( "Result : " + ifPolindrome(input));

        System.out.println();

        input = "sda";
        System.out.println(" Input : " + input);
        System.out.println( "Result : " + ifPolindrome(input));

    }
    private static boolean ifPolindrome (String input){
        if(input != null){
        String AfterReverse = new StringBuilder(input).reverse().toString();
        return AfterReverse.equals(input);


        }
        return false;

    }
}
