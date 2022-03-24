package misc;

import java.util.Set;

public class CountUniqueValues {

    public int countUniqueValues(int [] arr) {

        // HashSet
        // LinkedHashSet
        // TreeSet

        if (arr.length == 0) {
            return 0;
        }
        //[1,4,5,5,5,7,9]
        int first = 0;
        for (int second = 1; second < arr.length; ++second) {
            if (arr[first] != arr[second]) {
                ++first;
                if (first != second)
                    arr[first] = arr[second];
            }
        }

        return first + 1;
    }
}
