
import java.util.Scanner;

public class PatternOccurency {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string and pattern:");
        String text = scanner.nextLine();
        scanner.close();
        String[] words = text.split("\\s++");
        String word = words[0];
        String pattern = words[1];
        int patternCount = pattern.length();

        for(int i = 0; i < word.length(); ++i) {
            if (i + patternCount <= word.length()) {
                System.out.println(word.substring(i, i + patternCount));
                if (word.substring(i, i + patternCount).equals(pattern)) {
                    System.out.println("index:" + i);
                }
            }
        }



    }
}
