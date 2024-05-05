
import java.util.HashSet;
import java.util.Scanner;

public class PrintOnlyWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String text = scanner.nextLine();
        String cleanText = getOnlyAlphabet(text);
        String[] words = cleanText.split("\\s+");

        for(int i = 0; i < words.length; ++i) {
            System.out.println(i + 1 + ":" + words[i]);
        }

        scanner.close();
    }

    private static String getOnlyAlphabet(String text) {
        HashSet<Character> myChars = new HashSet();
        StringBuilder sbNewText = new StringBuilder();

        char myChar;
        for(myChar = 'a'; myChar <= 'z'; ++myChar) {
            myChars.add(myChar);
        }

        for(myChar = 'A'; myChar <= 'Z'; ++myChar) {
            myChars.add(myChar);
        }

        myChars.add(' ');

        for(int i = 0; i < text.length(); ++i) {
            if (myChars.contains(text.charAt(i))) {
                sbNewText.append(text.charAt(i));
            }
        }

        return sbNewText.toString();
    }
}
