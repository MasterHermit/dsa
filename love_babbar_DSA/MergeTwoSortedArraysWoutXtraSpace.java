//idea:-check if last element of array1 is greater or smaller then the array2.
//by doing this we can swap all the smaller elements to one array and greater to another array.
//then we can sort both the arrays to get desired result.
// ALGORITHM :-
//take 2 pointers i and j .
//initialize i from end of array1 and j from 0 of array2.
//run a while loop till i>=0 && j<array2.length
//check if array1[i]>=array2[j].if true than swap them.
//else break out of the loop .(as there will no element in array1 that will be more than array2 ).
//finally sort both the arrays(out of loop).

import java.util.*;

public class MergeTwoSortedArraysWoutXtraSpace {
    public static void main(String[] args) {
        int[] a = { 2, 4, 6 };
        int[] b = { 1, 3, 5 };
        int m = a.length;
        int n = b.length;
        int i = m - 1;
        int j = 0;
        while (i >= 0 && j < n) {
            if (a[i] >= b[j]) {
                int temp = b[j];
                b[j] = a[i];
                a[i] = temp;
                i--;
                j++;
            } else
                break;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }

}
