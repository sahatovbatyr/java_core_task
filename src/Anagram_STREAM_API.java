//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Anagram_STREAM_API {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the 2 words:");
        String text = scanner.nextLine();
        String[] words = text.split("\\s++");
        String word1 = words[0];
        String word2 = words[1];
        if (word1.length() != word2.length() || word1.equals(word2)) {
            System.out.println("the words is NOT anagram");
        }

        Map<String, Long> map1 = (Map)Arrays.stream(word1.split("")).collect(Collectors.groupingBy((ch) -> {
            return ch;
        }, Collectors.counting()));
        Map<String, Long> map2 = (Map)Arrays.stream(word1.split("")).collect(Collectors.groupingBy((ch) -> {
            return ch;
        }, Collectors.counting()));


        for(  String key: map1.keySet() ) {

            if ( !map2.containsKey(key) || map1.get(key) != map2.get(key) ) {
                System.out.println("NOT anagram ...");
                return;
            }

        }

        System.out.println("the Words is ANAGRAM");


    }
}

