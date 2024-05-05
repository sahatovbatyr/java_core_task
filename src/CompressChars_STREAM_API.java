//Implement a function to perform basic string compression
//        using the counts of repeated characters. For example,
//        the string "aabcccccaaa" would become "a2b1c5a3".
//        Example: Input: "aabcccccaaa" -> Output: "a2b1c5a3"

import java.util.Scanner;

public class CompressChars_STREAM_API {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text to COMPRESS:");
        String text = scanner.nextLine();
        scanner.close();
        String[] myChars = text.split("");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < myChars.length; ++i) {
            int count = 1;

            for(int j = i + 1; j < myChars.length && i < myChars.length && myChars[i].equals(myChars[j]); j = i + 1) {
                ++count;
                ++i;
            }

            sb.append(myChars[i] + count);
        }

        System.out.println(text + "=" + sb);
    }
}
