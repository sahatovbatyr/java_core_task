
import java.util.Scanner;

public class IsEvenNumber {
    public IsEvenNumber() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number:");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("NOT even number");
        }

    }
}
