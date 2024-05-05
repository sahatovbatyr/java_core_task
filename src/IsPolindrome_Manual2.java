
import java.util.Scanner;

public class IsPolindrome_Manual2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = scanner.nextLine();
        scanner.close();
        char[] chars = word.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = chars.length - 1; i >= 0; --i) {
            sb.append(chars[i]);
        }

        System.out.println("reversed: " + sb);
        if (sb.toString().equals(word)) {
            System.out.println("Polindrome");
        } else {
            System.out.println("NOT Polindrome");
        }

    }
}
