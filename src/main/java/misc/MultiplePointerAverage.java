package misc;

public class MultiplePointerAverage {

    public int hasAveragePair(int [] arr, double avg) {
        // [1,2,3], 2.5
        if (arr.length == 0) {
            return 0;
        }

        int end = arr.length - 1;
        for (int start = 0; start < end;) {
            double calculatedAvg = (double)(arr[end] + arr[start]) / 2;
            if ( calculatedAvg == avg) {
                return 1;
            }

            if (calculatedAvg > avg) {
                --end;
            } else {
                ++start;
            }
        }

        return 0;
    }

    private boolean checkIfSubString(String str1, String str2) {
        if (str1.isEmpty()) return true;

        int i = 0;
        int j = 0;

        while(j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
            }

            if (i == str1.length()) return true;
            j++;
        }

        return false;
    }

    public static void main(String [] args) {
        int [] arr = {1,3,3,5,6,7,10,12,19};
        MultiplePointerAverage average = new MultiplePointerAverage();
        System.out.println(average.hasAveragePair(arr, 8));
        System.out.println(average.checkIfSubString("panch", "hello panco panch"));
    }
}
