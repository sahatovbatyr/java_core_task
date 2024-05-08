import java.util.Arrays;

public class Sorting_QuickSortMy {


    public static void main(String[] args ) {

        int[] myNumbers = { 30, -5, 50, 20, 13, 60,60, 30,45, 1};
        System.out.println("Before: "+Arrays.toString(myNumbers));

        quickSort( myNumbers, 0, myNumbers.length-1);

        System.out.println(" After: "+Arrays.toString(myNumbers));

    }

//    takeLastElementAsPivot_and_findPlaceForIt_where_lessElementsLocatedInLeft_lastElementsInRight_andReturn
    private static int lessElementsInLeft_lastElementsInRight( int[] arr, int start, int end){

        int pivot = end ;
        int lastMovedIndex = start-1;

        for( int j=start; j<pivot; j++) {
            if( arr[j]<arr[pivot]) {
                lastMovedIndex++;
                int temp = arr[j];
                arr[j]=arr[lastMovedIndex];
                arr[lastMovedIndex]=temp;
            }
        }

        lastMovedIndex++;
        int temp = arr[pivot];
        arr[pivot]=arr[lastMovedIndex];
        arr[lastMovedIndex]=temp;

       return lastMovedIndex;

    }

    private static void quickSort( int[] arr, int start, int end){

        if ( start<end) {

            int pivot = lessElementsInLeft_lastElementsInRight(arr, start, end);

            quickSort( arr, start, pivot-1);
            quickSort( arr, pivot+1, end);
        }

    }



}
