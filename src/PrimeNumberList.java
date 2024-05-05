import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrimeNumberList {




    public static void main( String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of numbers:");

        String textNumbers = scanner.nextLine();

        final List<Integer> numbers = Arrays.stream( textNumbers.split("\\s++"))
                .map( Integer::valueOf)
                .collect(Collectors.toList() );

        System.out.println("*************************************");

        for( int iNumber: numbers) {

           boolean isPrime = isPrimeNumber( iNumber);

           if ( isPrime) {
               System.out.println(iNumber);
           }


        }



    }


    public static boolean isPrimeNumber( int number){

        boolean isPrime = false;

        if ( number == 1 || number == 2 || number == 3) {
//            System.out.println( "the Number is PRIME");
            return true;
        }

        for(int i=2; i<=Math.sqrt(number); i++ ){

            if ( number%i==0 ) {
                isPrime = false;
//                System.out.println(" the Number is Not Prime, Divider="+i);
                return isPrime;
            }

        }


//        System.out.println( "the Number is PRIME");
        isPrime = true;
        return isPrime;

    }

}
