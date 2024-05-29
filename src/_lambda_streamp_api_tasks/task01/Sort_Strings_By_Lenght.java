package _lambda_streamp_api_tasks.task01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_Strings_By_Lenght {

    public static void main(String[] args) {

        System.out.println("enter the string LINE, with space examaple: aaa bbbb ccccc:");
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();
        String[] words = inputLine.split("\\s+");

//        first method
        Arrays.sort( words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

//        second method
        Arrays.sort( words, Comparator.comparingInt(String::length) );

        System.out.println( Arrays.toString(words));




    }


}





