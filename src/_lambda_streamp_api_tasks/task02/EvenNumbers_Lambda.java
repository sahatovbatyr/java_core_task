package _lambda_streamp_api_tasks.task02;

//2.Filtering a list of numbers
//Write a lambda expression to filter a list of numbers to retain only the even numbers.
//Create a list of numbers and filter it using a lambda expression to keep only the even numbers.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenNumbers_Lambda {

    public static void main(String[] args) {

        System.out.println("Enter number list through space, exampl: 20 30 40 50 please enter: ");
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        scanner.close();

        List<Integer> numbers = Arrays.stream( inputText.split("\\s+"))
                .map( x-> Integer.valueOf(x))
                .collect(Collectors.toList());

//        Predicate<Integer> isEven = ( x) ->  { return x%2 ==0 ;  };
        Predicate<Integer> isEven = ( x) -> x%2 ==0;

        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer number:numbers){

            if( isEven.test(number)) evenNumbers.add(number);

        }

        System.out.println(evenNumbers);

    }
}
