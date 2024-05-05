//Implement a function that concatenates an array of strings into a single string,
//        separating each element with a given separator.

//        Example: Input: ["apple", "banana", "orange"], separator=", " ->
//        Output: "apple, banana, orange"

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class ConcatSeparator_Lambda {
    public ConcatSeparator_Lambda() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter STRING ARRAYS:");
        String string_text = scanner.nextLine();
        System.out.println("enter SEPERATOR:");
        String seperator = scanner.nextLine();
        scanner.close();
        String[] words = string_text.split("\\s++");
        Optional<String> result = Arrays.stream(words).reduce((x, y) -> {
            return x + seperator + y;
        });
        System.out.println((String)result.get());
    }
}
