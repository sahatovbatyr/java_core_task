import java.util.Arrays;

 class Sorting_MergeSort {

//    this is my solution

    public static void main(String[] args ) {

        int[] myNumbers = {20, 30,5, 40,60,3,80,4,10,90};

        System.out.println("Before"+Arrays.toString( myNumbers));
        System.out.println("After "+Arrays.toString( split(myNumbers)));


    }


    public static int[] merge( int[] arr1, int[] arr2 ) {

        int[] merged = new int[arr1.length+arr2.length];

        int i =0, i1 = 0, i2 =0;

 //    Bottom short WHILE code
//        while ( i1< arr1.length && i2<arr2.length ) merged[i++] = ( arr1[i1]<arr2[i2] ) ? arr1[i1++]:arr2[i2++];
        while ( i1< arr1.length && i2<arr2.length ) {

            if ( arr1[i1]< arr2[i2] ) { merged[i++] = arr1[i1++];}
            else {  merged[i++] = arr2[i2++]; }

        }

        // short while meaning
//        while ( i1<arr1.length) {
//            merged[i] = arr1[i1];
//            i++;
//            i1++;
//        }
        while ( i1<arr1.length) merged[i++]=arr1[i1++];
        while ( i2<arr2.length) merged[i++]=arr2[i2++];

//        System.out.println( Arrays.toString(merged));

        return merged;

    }

    public static int[] split( int[] arr ) {

        if ( arr.length == 1 ) { return arr; }
        if ( arr.length == 2 ) {

            int[] temp1 = new int[]{ arr[0] };
            int[] temp2 = new int[]{ arr[1] };

            return merge(temp1, temp2);
        }

        int[] arrLeft = new int[ arr.length/2];
        int[] arrRight = new int[arr.length-arr.length/2];

        System.arraycopy( arr,0, arrLeft, 0, arrLeft.length);
        System.arraycopy( arr,arrLeft.length, arrRight, 0, arrRight.length);

//        System.out.println("leftArray="+Arrays.toString(arrLeft));
//        System.out.println("rightArray="+Arrays.toString(arrRight));

        return merge( split( arrLeft), split( arrRight ) );

    }



}
