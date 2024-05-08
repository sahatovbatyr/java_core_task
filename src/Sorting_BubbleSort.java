import java.util.Arrays;

public class Sorting_BubbleSort {


    public static void main(String[] args ) {

        int[] myNumbers = {3,4,3,20,12,5,4,40,1,8,20};

        System.out.println("Before:"+Arrays.toString(myNumbers));
        sort( myNumbers, myNumbers.length);
        System.out.println(" After:"+Arrays.toString(myNumbers ));


    }

    public static void sort( int[] arr, int workingLenth ) {

        if( workingLenth<=0) { return; }

        for(int i=0; i<workingLenth-1; i++) {

            if( arr[i]>arr[i+1]) {
                int temp = arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
            }

        }

        sort(arr, workingLenth-1);
    }



}
