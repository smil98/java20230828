package ch12api.lecture;

import java.util.Arrays;

public class C25arrays {
    public static void main(String[] args) {
        //Arrays: methods that deal with array
        //equals: whether arrays are equivalent
        //fill : fill array with certain value
        //sort : sorting arrays
        //binarySearch : search index for certain element
        //toString : convert to string

        int[] arr1 = new int[5];
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1, 10);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {3, -2, 10, 0, -1};
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {3, 4, 5};
        int[] arr4 = {3, 4, 5};
        int[] arr5 = {4, 3, 5};
        System.out.println(Arrays.equals(arr3, arr4));
        System.out.println(Arrays.equals(arr4, arr5)); //if order is different false



    }
}
