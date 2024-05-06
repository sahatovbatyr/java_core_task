import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberSorting_Buble {

    public  static void main(String[] args ) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers array with space a b c d:");
        String inputText = scanner.nextLine();

        String[] numbersTextList = inputText.split("\\s++");


        List<Integer> numbers = Arrays.stream(numbersTextList)
                .map( Integer::valueOf)
                .collect(Collectors.toList());

        for( int i=0; i<numbers.size(); i++ ) {

            for( int j=i; j<numbers.size(); j++ ) {

                if( numbers.get(i) > numbers.get(j) ) {
                    int temp = numbers.get(i);
                    numbers.set(i,  numbers.get(j));
                    numbers.set(j,  temp);

                }
            }
        }

        numbers.stream()
                .forEach( x-> System.out.print(x+" "));



    }
}
