import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Habr01_STREAM_API {

    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();

        func(number);


    }

    private static void func(int n) {

//        for(int i=0; i<=n; i++){
//            if( i%3 == 0 && i%5 != 0  &&  getDigitSum(i) <10 ) System.out.println(i);
//        }

         IntStream.range(0,n).boxed()
                .filter( x-> x%3 == 0 && x%5 !=0 && getDigitSum(x)<10)
                 .forEach( x-> System.out.println(x));



    }

    private static int getDigitSum( int n){

        String[] myDigitText = String.valueOf(n).split("");

        int sum = Arrays.stream(myDigitText)
                .map( Integer::valueOf)
                .collect( Collectors.summingInt( x->x) );

//        for(int i=0; i<myDigitText.length; i++) {
//            sum = sum+ Integer.valueOf ( myDigitText[i]);
//        }

        return sum;

    }
}
