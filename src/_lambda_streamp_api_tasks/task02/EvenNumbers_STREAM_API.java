package _lambda_streamp_api_tasks.task02;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenNumbers_STREAM_API {

    public static void main(String[] args) {

        System.out.println("input the numbers through space, 1 2 3 4 please:");
        Scanner scanner = new Scanner(System.in);
        String numbersText = scanner.nextLine();
        scanner.close();

         List<Integer> numbers = Arrays.stream( numbersText.split("\\s+") )
                 .map(x->Integer.valueOf(x))
                 .filter( n->n%2==0)
                 .collect(Collectors.toList());

        System.out.println(numbers);

    }
}
