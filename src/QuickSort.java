import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args ) {

        int[] list= {2, 12, 5, 48, 0, 4};
        quickSort(list, 0, 5);
        Arrays.stream(list)
                .forEach( x->  System.out.print(x+" ") );

    }

    private static int partition(int[] list, int start, int pivot)
    {
        int i = start;
        int temp ;

        while(i < pivot)
        {
            if(list[i] > list[pivot] && i == pivot-1)
            {
//                swap(list[i], list[pivot]);
                temp = list[i];
                list[i] = list[pivot];
                list[pivot] =temp;

                pivot--;
            }

            else if(list[i] > list[pivot])
            {
//                swap(list[pivot - 1], list[pivot]);
                temp = list[pivot - 1];
                list[pivot - 1] = list[pivot];
                list[pivot] = temp;


//                swap(list[i], list[pivot]);
                temp = list[i];
                list[i] = list[pivot];
                list[pivot] =temp;

                pivot--;
            }

            else i++;
        }
        return pivot;
    }


    private static void quickSort(int[] list, int start, int end)
    {
        if(start < end)
        {
            int pivot = partition(list, start, end);
            quickSort(list, start, pivot - 1);
            quickSort(list, pivot + 1, end);
        }
    }




}
