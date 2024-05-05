import java.util.Scanner;

public class PrimeNumber {

    public static void main( String[] args){

        System.out.println("Enter number to check:");
        Scanner scaner = new Scanner( System.in);
        int number = scaner.nextInt();

        if ( number == 1 || number == 2 || number == 3) {
            System.out.println( "the Number is PRIME");
            return;
        }

        for(int i=2; i<=Math.sqrt(number); i++ ){

            if ( number%i==0 ) {
                System.out.println(" the Number is Not Prime, Divider="+i);
                return;
            }

        }

        System.out.println( "the Number is PRIME");

    }

}
