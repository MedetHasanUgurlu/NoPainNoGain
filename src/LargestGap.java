import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestGap {
    public static void main(String[] args) {
//		Given an array of integers, return the largest gap between the sorted elements of the array.
//		[9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
//		[0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
//		... so that we now see that the largest gap in the array is between 9 and 20 which is 11.
        int[] a = {0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 100};
        System.out.println(findLargestGap(a));

    }

    public static int findLargestGap(int[] arr){
        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();
        int initial = arr[0];
        int gaps;
        for (int i = 0; i < arr.length; i++) {
            gaps = arr[i]-initial;
            initial = arr[i];
            list.add(gaps);

        }
        return Collections.max(list);

    }
}
