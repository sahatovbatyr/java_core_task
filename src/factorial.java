import java.util.Scanner;

public class factorial {

    public static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");

        final int number = scanner.nextInt();

        System.out.println("n!="+factorial(number));



    }

    private static long factorial( int n) {

        if ( n == 1 ) {
            return 1;
        } else {

            return  n*factorial(n-1);
        }

    }
}
