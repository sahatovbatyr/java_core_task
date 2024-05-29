package _lambda_streamp_api_tasks.task01;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_Strings_By_Lenght_Before_Java8 {

    public static void main(String[] args) {

        System.out.println("enter the string LINE, with space examaple: aaa bbbb ccccc:");
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();
        String[] words = inputLine.split("\\s+");

        Comparator<String> lengthComparator = new Comparator<>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        Arrays.sort(words);
        System.out.println( "Arrays.sort( words):"+ Arrays.toString(words));

        System.out.println("*************************************************");

        Arrays.sort(words, lengthComparator);
        System.out.println( "Arrays.sort( words, lengthComparator ):"+ Arrays.toString(words));




    }
}
