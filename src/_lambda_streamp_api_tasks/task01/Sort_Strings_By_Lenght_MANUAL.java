package _lambda_streamp_api_tasks.task01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sort_Strings_By_Lenght_MANUAL {

    public static void main(String[] args) {

        System.out.println("enter the string LINE, with space examaple: aaa bbbb ccccc:");
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        scanner.close();
        String[] words = inputLine.split("\\s+");


        Comparator<String> compareByLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        bubbleSort(words, compareByLength);

        System.out.println( Arrays.toString(words));


    }

    public static void bubbleSort(String[] array, Comparator<String> comparator) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (comparator.compare(array[j], array[j + 1]) > 0) {
                    // Меняем элементы местами
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Если во внутреннем цикле не было перестановок, массив уже отсортирован
            if (!swapped) {
                break;
            }
        }
    }
}
