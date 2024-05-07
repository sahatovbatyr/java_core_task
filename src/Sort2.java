import java.util.Arrays;


public class Sort2 {




    public static void main(String[] args) {
        int[] array = {17, 14, 15, 28, 6, 8, -6, 1, 3, 18};

        System.out.println("Unsorted Array: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);

        System.out.println("  Sorted Array: " + Arrays.toString(array));


    }


    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = partition(arr, start, end);

            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }


    private static int partition(int[] arr, int start, int pivot) {
//        int pivot_ = arr[pivot];
        int i = (start - 1);

        String note = String.format( "[star_ind=%s -> %s, piv_ind=%s -> %s", start, arr[start], pivot, arr[pivot])+"] ";

        System.out.println(" ");
        System.out.println( String.format( " start_index=%s -> %s,  pivot_index=%s -> %s", start, arr[start], pivot, arr[pivot]));

        for (int j = start; j < pivot; j++) {
            System.out.println( String.format(note+ "i=%s,  j=%s",i, j ));

            System.out.println( String.format(note+ "if  arr[%s]=(%s) < arr[%s]=(%s) ??? ", j, arr[j], pivot, arr[pivot]) );
            if (arr[j] < arr[pivot] ) {

                System.out.print( String.format( note+"Yes, it is  arr[%s]=(%s) < arr[%s]=(%s) ??? ", j, arr[j], pivot, arr[pivot]) );
                i++;


                System.out.println(note+ " Before swap "+ Arrays.toString(arr));
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;


                System.out.println( String.format( note+ " Then i++=%s and swap( arr[%s]=%s, arr[%s]=%s)",i, i,arr[i], j, arr[j] ));
                System.out.println(note+ "After swap "+ Arrays.toString(arr));
                System.out.println(" ");
            }
        }

        System.out.println(note+"=======================  END LOOOOP   ===================================");
        System.out.println("    ");


        System.out.println(note+ String.format( " After LOOP swap( arr[%s]=%s, arr[%s]=%s)", i+1, arr[i+1], pivot, arr[pivot] ));

        System.out.println( note+" Before swap "+ Arrays.toString(arr));

        int temp = arr[i + 1];
        arr[i + 1] = arr[pivot];
        arr[pivot] = temp;


        System.out.println(note+ "After swap "+  Arrays.toString(arr));

        return i + 1;
    }
}

