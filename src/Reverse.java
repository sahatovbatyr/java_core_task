import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        System.out.println("int max="+Integer.MAX_VALUE);
        System.out.println("Enter int:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int digit =0;
        long reverse = 0L;
        boolean isNegative = ( number>=0) ? false:true;
        number = Math.abs(number);

        while ( number>0) {
            digit = number%10;
            number = number/10;
            reverse =reverse*10+digit;
        }

        reverse = (isNegative)?-1*reverse:reverse;
        if ( reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE) reverse=0;
        System.out.println(reverse);

    }

}
