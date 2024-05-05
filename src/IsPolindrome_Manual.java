
import java.util.Scanner;

public class IsPolindrome_Manual {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word:");
        String word = scanner.nextLine();
        scanner.close();
        String reversed = reverse(word);
        System.out.println("reversed:" + reversed);
        if (reversed.equals(word)) {
            System.out.println("polindrome");
        } else {
            System.out.println("NOT polindrome");
        }

    }

    private static String reverse(String text) {
        StringBuilder sb = new StringBuilder();
        int lenght = text.length();
        if (text.length() > 1) {
            String var10000 = reverse(text.substring(1, lenght));
            return var10000 + sb.append(text.charAt(0));
        } else {
            sb.append(text);
            return sb.toString();
        }
    }
}
