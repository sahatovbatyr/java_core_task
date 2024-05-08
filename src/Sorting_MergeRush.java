import java.util.Arrays;

public class Sorting_MergeRush {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(split(new int[] {3,2,1})));
    }

    public static int[] split(int[] array) {
        if (array.length == 1) return array;
        if (array.length == 2) return mergeArrays(new int[] {array[0]}, new int[] {array[1]});

        int[] left = new int[array.length / 2];
        int[] right = new int[array.length - array.length / 2];

        System.arraycopy(array, 0, left, 0, left.length);
        System.arraycopy(array, left.length, right, 0, right.length);

        return mergeArrays(split(left), split(right));
    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] a = new int[a1.length + a2.length];
        int i = 0, i1 = 0, i2 = 0;

        while (i1 < a1.length && i2 < a2.length) a[i++] = (a1[i1] < a2[i2] ) ? a1[i1++] : a2[i2++];
        while (i1 < a1.length) a[i++] = a1[i1++];
        while (i2 < a2.length) a[i++] = a2[i2++];
        return a;
    }
}
