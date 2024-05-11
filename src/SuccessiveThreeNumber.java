// is n given number result multiply three successive numbers. n = { m*(m+1)*(m+2), ..., k*(k+1)*(k+2)  }

import java.util.Scanner;

public class SuccessiveThreeNumber {

    public static void main( String[]  args){

        System.out.println("Enter n:");
        Scanner scanner = new Scanner(System.in);
        int number  = scanner.nextInt();

        find( number);



    }

    public static void find( int n ) {

        for( int j=1; j<=n; j++) {

            for( int i=1; i<=j/2; i++) {

                if( i*(i+1)*(i+2) ==  j )  {
                    System.out.println(i+"*"+(i+1)+"*"+(i+2)+"="+j);
                    break;


                }

            }

        }


    }
}
