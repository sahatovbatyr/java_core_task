//Create a function to determine if
//        two strings are anagrams of each other
//        (contain the same characters but in a different order).
//        Example: Input: "listen", "silent" -> Output: True

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Anagram {


    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Enter the first and second words:");
        String text = scaner.nextLine();
        String[] words = text.split("\\s+");
        String word1 = words[0];
        String word2 = words[1];

        if ( word1.length() != word2.length() || word1.equals(word2)  ) {
            System.out.println("Not Anagram");
            return;
        }

            HashMap<Character, Integer> myCharDict1 = getCharsCountDict(word1);
            HashMap<Character, Integer> myCharDict2 = getCharsCountDict(word2);

            for(  char key: myCharDict1.keySet() ) {

                if ( !myCharDict2.containsKey(key) || myCharDict1.get(key).equals( myCharDict2.get(key) ) ) {
                    System.out.println("NOT anagram ...");
                    return;
                }

            }

        System.out.println("the Words is ANAGRAM");

    }

    public static  HashMap<Character, Integer>  getCharsCountDict( String word) {

        char[] myChars = word.toCharArray();
        int wordLength = word.length();
        HashMap<Character, Integer> myCharDict = new HashMap<>(wordLength);

        for(int i=0; i < wordLength; i++) {
            char iChar = myChars[i];
            if (myCharDict.containsKey(iChar)) {
                myCharDict.put(iChar, (Integer)myCharDict.get(iChar) + 1);
            } else {
                myCharDict.put(iChar, 0);
            }
        }

        return  myCharDict;
    }


}


