
import java.util.Scanner;

public class InputString {
    public InputString() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String text = scanner.nextLine();
        System.out.println("Lenght=" + text.length());
    }
}