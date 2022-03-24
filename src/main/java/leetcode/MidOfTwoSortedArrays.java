package leetcode;

class MidOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1 == null && nums2 == null) {
            return 0;
        }


        if (nums1.length == 0 && nums2.length == 0) {
            return 0;
        }

        int[] arr = new int[nums1.length + nums2.length];
        if (nums1.length == 0 || nums2.length == 0) {
            if (nums1.length > 0) {
                arr = nums1;
            } else {
                arr = nums2;
            }
        } else {
            int index = 0;
            int ptr1 = 0;
            int ptr2 = 0;

            for(; index < arr.length - 1; ++index) {

                if (ptr1 > nums1.length-1) {
                    for (; ptr2 < nums2.length-1;) {
                        arr[index] = nums2[ptr2++];
                    }
                } else if (ptr2 > nums2.length-1) {
                    for (; ptr1 < nums1.length-1;) {
                        arr[index] = nums1[ptr1++];
                    }
                } else {
                    if (nums1[ptr1] < nums2[ptr2]) {
                        arr[index] = nums1[ptr1++];
                    } else {
                        arr[index] = nums2[ptr2++];
                    }
                }
            }
        }


        int length = arr.length / 2;
        double median = 0;

        if (length % 2 == 0) {
            median = arr[length - 1] + arr[length] / 2;
        } else {
            median = arr[length]/2;
        }

        return median;
    }

    public static void main(String[] args) {
        MidOfTwoSortedArrays sol = new MidOfTwoSortedArrays();
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        System.out.println(sol.findMedianSortedArrays(arr1, arr2));
    }
}