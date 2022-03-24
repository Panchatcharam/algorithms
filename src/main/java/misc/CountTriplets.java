package misc;

import java.util.Arrays;
import java.util.Comparator;

public class CountTriplets {

    public static void main(String[] args) {
        CountTriplets triplets = new CountTriplets();
        int [] arr = {5, 1, 3, 4, 7};
        System.out.println(
                triplets.
                        countTripletsWithSumSmallerThanGivenValue(arr, 12)
        );
    }

    //Input : arr[] = {-2, 0, 1, 3}
    //        sum = 2.
    //Output : 2
    //Explanation :  Below are triplets with sum less than 2
    //               (-2, 0, 1) and (-2, 0, 3)
    //
    //Input : arr[] = {5, 1, 3, 4, 7}
    //        sum = 12.
    //Output : 4
    //Explanation :  Below are triplets with sum less than 12
    //               (1, 3, 4), (1, 3, 5), (1, 3, 7) and
    //               (1, 4, 5)
    public int countTripletsWithSumSmallerThanGivenValue(
            int[] arr, int sum
    ) {
        Arrays.sort(arr);
        int count = 0;
        //{1, 3, 4, 5, 7}
        for (int index = 0; index < arr.length-2; ++index) {
            int left_index = index + 1, right_index = arr.length-1;

            while (left_index < right_index) {
                if (arr[index] + arr[left_index] + arr[right_index] >= sum) {
                    --right_index;
                } else {
                    count += right_index - left_index;
                    ++left_index;
                }
            }
        }

        return count;
    }
}
